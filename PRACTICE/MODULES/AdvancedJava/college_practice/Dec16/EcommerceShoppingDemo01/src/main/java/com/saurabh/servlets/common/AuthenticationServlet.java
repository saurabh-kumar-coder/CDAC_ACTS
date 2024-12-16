package com.saurabh.servlets.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Authenticate")
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try(
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "tiger");
					PreparedStatement psGetUsernameAndPassword = connection.prepareStatement("SELECT * FROM users WHERE userName = ? AND password = ?")
					) 
			{
				String userName = request.getParameter("username");
				String password = request.getParameter("password");
				psGetUsernameAndPassword.setString(1, userName);
				psGetUsernameAndPassword.setString(2, password);
				
				ResultSet result = psGetUsernameAndPassword.executeQuery();
				if(result.next()) {
					out.println("User Authenticated");
				} else {
					out.println("Invalid User");
					response.sendRedirect("login.html");
				}
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
