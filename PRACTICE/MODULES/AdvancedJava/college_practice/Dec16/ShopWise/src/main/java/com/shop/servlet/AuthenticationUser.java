package com.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticationUser
 */
@WebServlet("/Authenticate")
public class AuthenticationUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psFindUsernameAndPassword;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "tiger");

			psFindUsernameAndPassword = connection
					.prepareStatement("SELECT * FROM users WHERE userName = ? AND password = ?;");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			if (psFindUsernameAndPassword != null) {
				psFindUsernameAndPassword.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		try {
			psFindUsernameAndPassword.setString(1, userName);
			psFindUsernameAndPassword.setString(2, password);
			System.out.println(userName);
			System.out.println(password);
			try (ResultSet result = psFindUsernameAndPassword.executeQuery()) {
				System.out.println(psFindUsernameAndPassword);
				if (userName.equalsIgnoreCase("admin") && result.next() ) {
					response.sendRedirect("admin/adminHome.html");
				} else if (result.next()) {
					response.sendRedirect("user/userHome.html");
				} else {
					response.sendRedirect("login.html");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
