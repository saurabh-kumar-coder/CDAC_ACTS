package com.shop.servlet.admin;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class AddCategoryServlet
 */
@WebServlet("/AddCategory")
public class AddCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	Connection connection;
	PreparedStatement psInsertCategory;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "tiger");

			psInsertCategory = connection
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
			if (psInsertCategory != null) {
				psInsertCategory.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
