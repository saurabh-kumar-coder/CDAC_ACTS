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
 * Servlet implementation class CheckOut
 */
@WebServlet("/CheckOut")
public class CheckOut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psGetCards;
	
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
			psGetCards = connection.prepareStatement("SELECT * FROM card");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
			if (psGetCards == null) {
				psGetCards.close();
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
		HttpSession session = request.getSession(false);
		if(session == null) {
			response.sendRedirect("login.html");
			return;
		}
		String username = (String)session.getAttribute("username");
		PrintWriter writer = response.getWriter();
		try (ResultSet resultCards = psGetCards.executeQuery()) {
			writer.println("<html><body><form action='TransactionCart' method='post'>");
			writer.println("Welcome <b>" + username + "</b><br />");
			writer.println("TOTAL AMOUNT TO BE DEDUCTED : <b>" + session.getAttribute("totalPriceForCheckOut")+"</b><br />");
			writer.println("<div>SELECT CARD : <select name=cards>");
			while(resultCards.next()) {
				writer.println("<option value='"+resultCards.getString(1)+"'>"+resultCards.getString(1)+"</option>");
			}
			writer.println("</div>");
			writer.println("<div><input type='submit' value='buy'></div>");
			writer.println("</form></body></html>");
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
