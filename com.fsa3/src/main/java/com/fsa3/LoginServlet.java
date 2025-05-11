package com.fsa3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String uname = req.getParameter("username");
		String password = req.getParameter("password");
		
		String dbPass;
		try {
			dbPass = DataHandler.fetchPassword(uname);
			
			PrintWriter pw = resp.getWriter();
			
			if (password.equals(dbPass)) {
				
				pw.println("Login successfully");
				
			} else {
				pw.println("Login fail");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
