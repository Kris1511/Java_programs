package com.JdbceDemo5;
import java.util.Scanner;

import java.sql.*;

public class bank {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/company";
		String uname = "root";
		String pass = "root1234";
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		System.out.println("Data base connected");
		
		String sql = "{Call insert_data(?, ?, ?)}";
		
		CallableStatement cs = con.prepareCall(sql);
		
		System.out.println("Enter the id, name, balance");
		int id = sc.nextInt();
		String name = sc.next();
		int balance = sc.nextInt();
		
		cs.setInt(1, id);		
		cs.setString(2, name);
		cs.setInt(3, balance);
		
		int data = cs.executeUpdate();
		System.out.println(data + " rows updated");

	}

}
