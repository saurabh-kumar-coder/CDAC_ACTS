package com.shopwise.common;

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
 * Servlet implementation class TransactionCart
 */
@WebServlet("/TransactionCart")
public class TransactionCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psCheckBalance;
	PreparedStatement psDeductBalance;
	
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
			psCheckBalance = connection.prepareStatement("SELECT balance FROM card where cardNo = ?");
			psDeductBalance = connection.prepareStatement("UPDATE card SET balance = ? WHERE cardNo = ?");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			if (psCheckBalance == null) {
				psCheckBalance.close();
			}
			if (psDeductBalance == null) {
				psDeductBalance.close();
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
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("login.html");
			return;
		}
		int amount = (Integer) session.getAttribute("totalPriceForCheckOut");
		writer.println(amount);
		
		int cardNo = Integer.parseInt(request.getParameter("cardNo"));
		try {
			psCheckBalance.setInt(1, cardNo);
			
			ResultSet resultBalance = psCheckBalance.executeQuery();
			float balance = 0.0f;
			if(resultBalance.next()) {
				balance = resultBalance.getFloat("balance");
			} else {
				writer.println("No Card Found");
				return;
			}
			
			if(balance >= amount) {
				psDeductBalance.setFloat(1, balance - amount);
				psDeductBalance.setInt(2, cardNo);
				psDeductBalance.executeUpdate();
				writer.println("Transaction completed");
			} else {
				writer.println("Transaction NOT completed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
