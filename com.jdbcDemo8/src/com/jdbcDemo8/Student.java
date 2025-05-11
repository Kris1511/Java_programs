package com.jdbcDemo8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub		
		
		Students st = new Students(103, "Deva", "Chennai", 2019);
		regStduent(st);

	}
	
	public static void regStduent(Students st) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/company";
		String uname = "root";
		String pass = "root1234";
		
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Data base connected");
		
		// extraction from object
		int id = st.id;
		String name = st.name;
		String address = st.address;
		int yop = st.yop;
		
		String sql = "insert into student values(?, ?, ?, ?)";

		PreparedStatement st1 = con.prepareStatement(sql);
		
		st1.setInt(1, id);
		st1.setString(2, name);
		st1.setString(3, address);
		st1.setInt(4, yop);
		
		st1.executeUpdate();
	}

}


class Students {
	
	int id;
	String name;
	String address;
	int yop;
	
	public Students(int id, String name, String address, int yop) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.yop = yop;
	}
	
}