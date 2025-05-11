package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String dbName1 = "chandru";
		String dbPass1 = "1234";
		
		String dbName2 = "hari";
		
		String webUname = req.getParameter("username");
		String webPass = req.getParameter("password");
		
		
		if (webUname.equals(dbName1) && webPass.equals(dbPass1) || 
				webUname.equals(dbName2) && webUname.equals(dbPass1)) {
			
			req.setAttribute("username", webUname);
			
			RequestDispatcher pd = req.getRequestDispatcher("/home.jsp");
			pd.forward(req, resp);
			
		}
		
	}

}
