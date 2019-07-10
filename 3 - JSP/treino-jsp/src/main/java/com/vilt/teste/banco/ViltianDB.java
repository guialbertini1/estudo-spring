package com.vilt.teste.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class ViltianDB {

	private DataSource dataSource;

	public ViltianDB(DataSource theDataSource) {
		dataSource = theDataSource;
	}

	public List<Viltian> getViltians() throws Exception {
		List<Viltian> viltians = new ArrayList<>();

		Connection con = null;
		Statement stm = null;
		ResultSet result = null;

		try {
			con = dataSource.getConnection();
			stm = con.createStatement();
			result = stm.executeQuery("select * from viltian order by id_viltian");

			while (result.next()) {

				int id = result.getInt("id_viltian");
				String nome = result.getString("nome_viltian");
				String sobrenome = result.getString("sobrenome_viltian");
				String email = result.getString("email_viltian");

				Viltian viltian = new Viltian(id, nome, sobrenome, email);

				viltians.add(viltian);
			}
			return viltians;

		} finally {
			close(con, stm, result);
		}

	}

	public void addViltian(Viltian viltian) throws Exception {
		Connection con = null;
		PreparedStatement stm = null;

		try {
			con = dataSource.getConnection();
			String query = "insert viltian values" + "(DEFAULT, ?, ?, ?)";
			stm = con.prepareStatement(query);
			stm.setString(1, viltian.getNome());
			stm.setString(2, viltian.getSobrenome());
			stm.setString(3, viltian.getEmail());

			stm.execute();
		} finally {
			close(con, stm, null);
		}

	}

	public Viltian getViltian(String viltianID) throws Exception {
		Connection con = null;
		PreparedStatement stm = null;
		ResultSet result = null;

		Viltian viltian = null;

		int idInt;

		try {
			idInt = Integer.parseInt(viltianID);

			String query = "select * from viltian where id_viltian = ?";
			con = dataSource.getConnection();
			stm = con.prepareStatement(query);
			stm.setInt(1, idInt);
			result = stm.executeQuery();

			if (result.next()) {
				String nome = result.getString("nome_viltian");
				String sobrenome = result.getString("sobrenome_viltian");
				String email = result.getString("email_viltian");
				viltian = new Viltian(idInt, nome, sobrenome, email);
			} else {
				throw new Exception("Could not find viltian id: " + idInt);
			}

			return viltian;
		} finally {
			close(con, stm, result);
		}
	}

	public void updateStudent(Viltian viltian) throws Exception {
		Connection con = null;
		PreparedStatement stm = null;
		
		String query = "update viltian set " 
					 + "nome_viltian = ?, " 
					 + "sobrenome_viltian = ?, " 
					 + "email_viltian = ? "
					 + "where id_viltian = ?";
		try {			
			con = dataSource.getConnection();
			stm = con.prepareStatement(query);
			
			stm.setString(1, viltian.getNome());
			stm.setString(2, viltian.getSobrenome());
			stm.setString(3, viltian.getEmail());
			stm.setInt(4, viltian.getId());
			
			stm.execute();
		}
		finally {
			close(con, stm, null);
		}
	}

	private void close(Connection con, Statement stm, ResultSet result) {
		try {
			if (result != null) {
				result.close();
			}
			if (stm != null) {
				stm.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
