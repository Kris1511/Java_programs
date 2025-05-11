package com.JdbcDemo2;

import java.sql.*;

public class JdbcDemo2 {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String uname = "root";
		String pass = "root1234";
		
		// insert data to the table database
//		String sql = "Insert into Students values(2, 'arun')";
		
		
		// whatever the table store the data that'll execute with query
		String sql = "select * from Students";
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		System.out.println("Connection to DBMS");
		
		Statement st = con.createStatement();
//		st.execute(sql);
//		int r = st.executeUpdate(sql);		// return integer value
//		System.out.println(r + " row inserted");
		
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Data received");
//		
//		rs.next();
//		
//		use while loop
//		
//		System.out.println("Roll: " + rs.getInt(1));
//		System.out.println("Name: " + rs.getString(2));
//		rs.next();
//		
//		System.out.println("Roll: " + rs.getInt(1));
//		System.out.println("Name: " + rs.getString(2));
//		rs.next();
//		
//		System.out.println("Roll: " + rs.getInt(1));
//		System.out.println("Name: " + rs.getString(2));
//		
		while (rs.next()) {
			System.out.println("Roll: " + rs.getInt(1));
			System.out.println("Name: " + rs.getString(2));
		}
//		
		rs.close();
		st.close();
		con.close();

	}

}
