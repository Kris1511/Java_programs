package com.fsa3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataHandler {
	
	public static void insertData(String name, String password) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost:3306/company";
		String uname = "root";
		String upass = "root1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uname, upass);
		
		String sql = "insert into customer value(?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, name);
		st.setString(2, password);
		
		
		st.executeUpdate();
		
	}
	
	public static String fetchPassword(String uname) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/company";
		String usname = "root";
		String upass = "root1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, usname, upass);
		
		String sql = "select password from customer where name = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, uname);		
		
		ResultSet rs = st.executeQuery();
		rs.next();
		
		String dbPass = rs.getString(1);
		
		return dbPass;
	}

}
