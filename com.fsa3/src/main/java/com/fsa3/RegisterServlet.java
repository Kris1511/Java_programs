package com.fsa3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest res, HttpServletResponse resp) throws IOException, ServletException {
		
		String uname = res.getParameter("username");
		String password = res.getParameter("password");
		
		System.out.println(uname + " " + password);
			
			try {
				DataHandler.insertData(uname, password);
//				PrintWriter write = resp.getWriter();
//				write.println("Data successfully added in the table");
				
				RequestDispatcher rd = res.getRequestDispatcher("/login.html");
				rd.forward(res, resp);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}

}
