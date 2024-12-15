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
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String city = req.getParameter("city");
		if(username.isEmpty() && password.isEmpty()) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Data is empty</h1>"); 
			out.println("</body>");
			out.println("</html>");
		}
		else if(username.equalsIgnoreCase("Ram") && password.equals("ram")) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1> username : " + username + "</h1>");
			out.println("<h1>password : " + password+"</h1>");
			out.println("<h1>city : " + city + "</h1>"); 
			out.println("</body>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>CHECK YOUR USERNAME AND PASSWORD</h1>"); 
			out.println("</body>");
			out.println("</html>");
		}
	}
}
