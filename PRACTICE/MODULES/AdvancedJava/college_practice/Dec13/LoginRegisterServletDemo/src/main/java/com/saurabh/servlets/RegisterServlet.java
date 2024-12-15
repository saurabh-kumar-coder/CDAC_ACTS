package com.saurabh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  resp.getWriter();
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		if(username.isEmpty() || password.isEmpty() || name.isEmpty() || email.isEmpty()) {
			out.println("data was not entered properly");
			resp.sendRedirect("/LoginRegisterServletDemo/Register.html");
		} else {
			String userTable = "<html>"
					+ "<body>"
					+ "<table border='2px solid black'>"
					+ "<tr>"
						+ "<th>"
						+ "username"
						+ "</th>"
						+ "<th>"
						+ "name"
						+ "</th>"
						+ "<th>"
						+ "email"
						+ "</th>"
					+ "</tr>"
					+ "<tr>"
						+ "<td>"
						+ username
						+ "</td>"
						+ "<td>"
						+ name
						+ "</td>"
						+ "<td>"
						+ email
						+ "</td>"
					+ "</tr>"
					+ "</table>"
					+ "</body>"
					+ "</html>";
			out.println(userTable);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
