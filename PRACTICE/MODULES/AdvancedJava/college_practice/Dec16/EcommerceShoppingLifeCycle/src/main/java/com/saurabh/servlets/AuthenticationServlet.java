package com.saurabh.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Authenticate")
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psGetUsernameAndPassword;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "tiger");
			psGetUsernameAndPassword = connection
					.prepareStatement("SELECT * FROM users WHERE userName = ? AND password = ?");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw new ServletException("Exception occured due to database", e);
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

		try {
			if (psGetUsernameAndPassword != null) {
				psGetUsernameAndPassword.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(userName == null || password == null) {
			throw new ServletException("Input issue, please enter both parameters");
		}
		
		try {
			psGetUsernameAndPassword.setString(1, userName);
			psGetUsernameAndPassword.setString(2, password);

			try (ResultSet result = psGetUsernameAndPassword.executeQuery()) {
				if (result.next()) {
					out.println("Valid User");
					response.sendRedirect("Category");
				} else {
					out.println("Invalid User");
					response.sendRedirect("login.html");
				}
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
