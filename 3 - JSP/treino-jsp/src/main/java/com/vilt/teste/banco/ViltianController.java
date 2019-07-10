package com.vilt.teste.banco;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/viltian")
public class ViltianController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ViltianDB viltianDB;

	@Resource(name = "jdbc/vilt_treinamento")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		try {
			viltianDB = new ViltianDB(dataSource);
		} catch (Exception exc) {
			throw new ServletException(exc);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String command = request.getParameter("command");
			if (command == null) {
				command = "LIST";
			}

			switch (command) {
			case "LIST":
				listViltians(request, response);
				break;
			case "ADD":
				addViltian(request, response);
				break;
			case "LOAD":
				loadViltian(request, response);
				break;
			case "UPDATE":
				updateViltian(request, response);
				break;
			default:
				listViltians(request, response);
			}

		} catch (Exception exc) {
			throw new ServletException(exc);
		}
	}


	
	private void updateViltian(HttpServletRequest request, HttpServletResponse response) throws Exception{
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		
		Viltian viltian = new Viltian(id, nome,sobrenome,email);
		
		viltianDB.updateStudent(viltian);
		
		response.sendRedirect("http://localhost:8080/treino-jsp/viltian");
	}

	private void loadViltian(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viltianID = request.getParameter("viltianID");
		Viltian viltian = viltianDB.getViltian(viltianID);
		
		request.setAttribute("viltian", viltian);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/viltians-update.jsp");
		dispatcher.forward(request, response);
	}

	private void addViltian(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		Viltian viltian = new Viltian(nome,sobrenome,email);
		
		viltianDB.addViltian(viltian);
		response.sendRedirect("http://localhost:8080/treino-jsp/viltian");
	}

	private void listViltians(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Viltian> viltians = viltianDB.getViltians();

		request.setAttribute("viltians", viltians);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
}