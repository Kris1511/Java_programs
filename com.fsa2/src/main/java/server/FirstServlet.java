package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String name = req.getParameter("name");
		String gen = req.getParameter("gen");
		String country = req.getParameter("country");
		String message = req.getParameter("message");
		String newsletter = req.getParameter("newsletter");

		
		PrintWriter write = resp.getWriter();
		write.print("Name: " + name);
		write.print("Gender: " + gen);
		write.print("Country: " + country);
		write.print("Message: " + message);
		write.print("Newsletter: " + newsletter);
		
	}

}
