package com.vilt.java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.vilt.data.util.AsideArchiveDataUtil;
import com.vilt.data.util.AsideArticleDataUtil;
import com.vilt.data.util.BlogspotDataUtil;
import com.vilt.data.util.CardMainDataUtil;
import com.vilt.data.util.CardSubDataUtil;
import com.vilt.data.util.NavbarDataUtil;
import com.vilt.models.AsideArchive;
import com.vilt.models.AsideArticle;
import com.vilt.models.Blogspot;
import com.vilt.models.CardMain;
import com.vilt.models.CardSub;
import com.vilt.models.Navbar;

@WebServlet("/home")
public class ContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// DEFINE DATASOURCE/CONNECTION POOL FOR RESOURCE INJECTION
	@Resource(name = "jdbc/vilt_treinamento")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// RETRIEVING DATA FROM DataUtil
		List<Navbar> navbar = NavbarDataUtil.getTexts();
		request.setAttribute("navbar", navbar);
		
		CardMain cardMain = CardMainDataUtil.getCardMain();
		request.setAttribute("cardMain", cardMain);
		
		List<CardSub> cardSub = CardSubDataUtil.getCardSub();
		request.setAttribute("cardSub", cardSub);
		
		List<Blogspot> blogspot = BlogspotDataUtil.getBlogspot();
		request.setAttribute("blogspot", blogspot);
		
		AsideArticle asideArticle = AsideArticleDataUtil.getAsideArticle();
		request.setAttribute("asideArticle", asideArticle);

		List<AsideArchive> asideArchive = AsideArchiveDataUtil.getAsideArchive();
		request.setAttribute("asideArchive", asideArchive);

		
		// RETRIEVING DATA FROM DATABASE

//		List<Navbar> navbar = new ArrayList<>();
//		List<CardMain> cardMain = new ArrayList<>();
//		List<CardSub> cardSub = new ArrayList<>();
//		List<Blogspot> blogspot = new ArrayList<>();
//		List<AsideArticle> asideArticle = new ArrayList<>();
//		List<AsideArchive> asideArchive = new ArrayList<>();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);

	}

}
