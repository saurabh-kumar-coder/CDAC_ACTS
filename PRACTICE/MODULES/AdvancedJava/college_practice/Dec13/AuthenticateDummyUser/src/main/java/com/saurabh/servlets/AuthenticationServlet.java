package com.saurabh.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/authenticate")
public class AuthenticationServlet  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println(new Date());
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String city = req.getParameter("city");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> username : " + username);
		out.println("password : " + password);
		out.println("city : " + city); 
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
