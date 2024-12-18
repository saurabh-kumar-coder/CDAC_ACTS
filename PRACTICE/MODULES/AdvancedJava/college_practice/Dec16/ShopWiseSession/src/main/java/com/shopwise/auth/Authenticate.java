package com.shopwise.auth;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;
	PreparedStatement psAuthenticateUser;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		ServletContext context = getServletContext();
		String DB_DRIVER = context.getInitParameter("DB_DRIVER");
		String DB_URL = context.getInitParameter("DB_URL");
		String USERNAME = context.getInitParameter("USERNAME");
		String PASSWORD = context.getInitParameter("PASSWORD");
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			psAuthenticateUser = connection.prepareStatement("SELECT * FROM users WHERE userName = ? AND password = ?");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void destroy() {
		try {
			if(psAuthenticateUser == null) {
				psAuthenticateUser.close();
			}
			if(connection == null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter writer = response.getWriter();
//		writer.println("get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("post");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			psAuthenticateUser.setString(1, username);
			psAuthenticateUser.setString(2, password);
			
			if(username == null || password == null) {
				response.sendRedirect("login.html");
				return;
			}
			
			try (ResultSet authResult = psAuthenticateUser.executeQuery()) {
				if(username.equalsIgnoreCase("a") && authResult.next()) {
					HttpSession session = request.getSession(false);
					session.setAttribute("username", username);
					response.sendRedirect("Admin");
					return;
				}
				if(authResult.next()) {
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					response.sendRedirect("Categories");
					return;
				} else {
					response.sendRedirect("login.html");
					return;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
