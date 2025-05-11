package com.JDBCDemo3;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo3 {
	
	static String url = "jdbc:mysql://localhost:3306/company";
	static String uname = "root";
	static String pass = "root1234";

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please choose the operation: ");
		
		System.out.println("1 - Insert data");
		
		System.out.println("2 - Fetch data");
		
		System.out.println("3 - Update data");
		
		System.out.println("4 - Delete data");
		
		System.out.println("5 - Exit");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: insertData();
		break;
		
		case 2: fetchData();
		break;
		
		case 3: updateData();
		break;
		
		case 4: deleteData();
		break;
		
		case 5: 
			System.out.println("Exit from the operation");
			break;
		
		default:
			System.out.println("Invalid choice");
			
		}

	}
	
	public static void insertData() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
//		String url = "jdbc:mysql://localhost:3306/company";
//		String uname = "root";
//		String pass = "root1234";
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		System.out.println("Connection established: " + con);
		
//		insert data to table: manually****
//		--------------------------------------------------
//		String sql = "Insert into emp values(4, 'Hari', 27)";
//		
//		Statement st = con.createStatement();
//		
//		int res = st.executeUpdate(sql);
//		
//		System.out.println(res + " rows updated");
//		--------------------------------------------------
		
//		show data in table:*******
//		-------------------------------------------------
//		Statement st = con.createStatement();
//		
//		String sql = "select * from emp";			
//		
//		ResultSet rs = st.executeQuery(sql);
//		
//		System.out.println("Data received");
//		
//		while (rs.next()) {
//			System.out.println("Roll: " + rs.getInt(1));
//			System.out.println("Name: " + rs.getString(2));
//		}
//		
//		rs.close();
//		st.close();
//		con.close();
//		--------------------------------------------------
		
		
//		asking dynamic user input:**********
//		-------------------------------------------------
		System.out.println("Enter the roll:");
		int roll = sc.nextInt();
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		String sql = "Insert into emp values(?, ?, ?)";
		
		// efficient way of write to insert data
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.setInt(3, age);
		
		int r = ps.executeUpdate();
		System.out.println(r + " rows updated");
//		-----------------------------------------------
		
		
	}
	
	// update the table************
//	---------------------------------------------
	public static void fetchData() throws Exception {
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		System.out.println("Connection to DBMS");
		
		String sql = "Select * from emp";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		System.out.println("Data received.");
		
		while (rs.next()) {
			
			System.out.println("Roll: " + rs.getInt(1));
			System.out.println("Name: " + rs.getString(2));
			
		}
		
	}
	
	// update statement
	public static void updateData() throws Exception {
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		String sql = "Update emp set name = 'deva' where roll = 3";
		
		Statement st = con.createStatement();
		
		int r = st.executeUpdate(sql);
		
		System.out.println(r + " rows updated");
		
	}
	
	// delete statement
	public static void deleteData() throws Exception {
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		String sql = "Delete from emp where roll = 4";
		
		Statement st = con.createStatement();
		
		int r = st.executeUpdate(sql);
		
		System.out.println(r + " rows deleted");
		
	}

}













