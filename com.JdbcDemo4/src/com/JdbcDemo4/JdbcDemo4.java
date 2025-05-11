package com.JdbcDemo4;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo4 {
	
	static String url = "jdbc:mysql://localhost:3306/company";
	static String uname = "root";
	static String pass = "root1234";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		insertData();
	}
	
	public static void insertData() throws Exception {
		
//		approach no 1:****
		
		Scanner sc = new Scanner(System.in);
//		
//		Connection con = DriverManager.getConnection(url, uname, pass);
//		
//		String sql = "insert into emp values(?, ?, ?)";
//		
//		System.out.println("Data base connected");
//		
//		System.out.println("Enter the roll: ");
//		int roll = sc.nextInt();			
//		
//		System.out.println("Enter the name: ");
//		String name = sc.nextLine();
//		sc.nextLine();
//		
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		
//		PreparedStatement st = con.prepareStatement(sql);
//		st.setInt(1, roll);
//		st.setString(2, name);
//		st.setInt(3, age);
//		
//		int r = st.executeUpdate();
//		System.out.println(r + " rows created");
		
		// approach no 2:****
		
//		Connection con = DriverManager.getConnection(url, uname, pass);
//		
//		System.out.println("Data base connected");
//		
//		String sql1 = "Insert into emp values(11, 'ram', 24)";
//		
//		String sql2 = "Insert into emp values(12, 'shyam', 27)";
//		
//		String sql3 = "Insert into emp values(11, 'vyam', 25)";
//		
//		Statement st = con.createStatement();
//		st.addBatch(sql1);
//		st.addBatch(sql2);
//		st.addBatch(sql3);
//		
//		st.executeBatch();
		
//		approach no 3:*****		addBatch
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		System.out.println("Data base connected");
		
		String sql1 = "Insert into emp values(?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql1);
		
		while (true) {
			System.out.println("Enter the roll:");
			int roll = sc.nextInt();
			
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, age);
			
			ps.addBatch();
			
			System.out.println("Enter 'Exit' to quit, or anything else to continue..");
			String status = sc.next().toLowerCase();
			
			if (status.equals("Exit")) {
				break;
			}
		}
		
		ps.executeBatch();
		
//		these above code update, delete, fetchdata in same class (task)***
		
	}

}















