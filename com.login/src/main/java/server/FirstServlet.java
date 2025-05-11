package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/login")
public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String dbUname = "chandru";
		String dbPass = "1234";
		
		String webUname = req.getParameter("username");
		String webPass = req.getParameter("password");
		
		
//		approach 1******
//		PrintWriter write = resp.getWriter();
		
//		if (dbUname.equals(webUname) && dbPass.equals(webPass)) {
//			write.print("Login successfully");
//		} else {
//			write.print("Login failed");
//		}
		
//		approach 2*******
		
//		if (dbUname.equals(webUname) && dbPass.equals(webPass)) {
//			
//			RequestDispatcher rd = req.getRequestDispatcher("/success.html");
//			rd.forward(req, resp);
//			
//		} else {
//			
//			RequestDispatcher rd = req.getRequestDispatcher("/fail.html");
//			rd.forward(req, resp);
//			
//		}
		
//		approach 3********
		if (dbUname.equals(webUname) && dbPass.equals(webPass)) {
			
			resp.sendRedirect("success.html");
			
		} else {
			resp.sendRedirect("fail.html");
		}
	}

}







