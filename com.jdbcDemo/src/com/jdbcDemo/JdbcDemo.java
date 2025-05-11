package com.jdbcDemo;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 2 - loading driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 3 - establishing connection		
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		
		// insert data to the table database
//		String sql = "Insert into Students values(1, 'Chandru')";
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		System.out.println("Connection established: " + con);
		
//		Statement st = con.createStatement();
//		st.execute(sql);

	}

}
