package com.shopwise.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AddCardDetails
 */
@WebServlet("/AddCardDetails")
public class AddCardDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Connection connection;
	PreparedStatement psAddCardDetails;
	
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
			psAddCardDetails = connection.prepareStatement("INSERT INTO card values (?, ?, ?)");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
			if (psAddCardDetails == null) {
				psAddCardDetails.close();
			}
			if (connection == null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession(false);
		if(session == null) {
			response.sendRedirect("login.html");
			return;
		}
//		String username = (String)session.getAttribute("username");
		int cardNo = Integer.parseInt(request.getParameter("cardNo"));
		float balance = Float.parseFloat(request.getParameter("balance"));
		String expiry = request.getParameter("expiry");
		
		try {
			psAddCardDetails.setInt(1, cardNo);
			psAddCardDetails.setFloat(2, balance);
			psAddCardDetails.setString(3, expiry);
			
			int resultAddCard = psAddCardDetails.executeUpdate();
			
			if(resultAddCard > 0) {
				writer.println("added card");
			} else {
				writer.println("added not card");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
