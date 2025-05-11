package com.JdbcDemo7_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Connection con = null;
		
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		
		Scanner sc = new Scanner(System.in);
		
		String dpath = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/company";
		
		String uname = "root";
		
		String pass = "root1234";
		
		String sql1 = "update bank set balance=balance-?where acc_num=?";
		String sql2 = "update bank set balance=balance-?where acc_num=?";
		
		try {
			
			Class.forName(dpath);
			
			con = DriverManager.getConnection(url, uname, pass);
			
			ps1 = con.prepareStatement(sql1);
			ps2 = con.prepareStatement(sql2);
			
			System.out.println("Enter from accno, to accno and amount to transfer");
			int fan = sc.nextInt();
			int tan = sc.nextInt();
			int amount = sc.nextInt();
			
			ps1.setInt(1, amount);
			ps2.setInt(1, amount);
			ps1.setInt(2, fan);
			ps2.setInt(2, tan);
			
			con.setAutoCommit(false);
			
			int res1 = ps1.executeUpdate();
			System.out.println("Dedcuted from " + res1 + " rows");
			
			int res2 = ps2.executeUpdate();
			System.out.println("Credited from " + res2 + " rows");
			
		} catch (Exception e1) {
			try {
				con.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		finally {
			try {
				con.close();
				ps1.close();
				ps2.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}














