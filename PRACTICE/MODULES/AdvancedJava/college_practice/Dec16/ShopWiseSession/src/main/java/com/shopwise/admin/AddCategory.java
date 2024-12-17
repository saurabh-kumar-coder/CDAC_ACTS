package com.shopwise.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
 * Servlet implementation class AddCategory
 */
@WebServlet("/AddCategory")
public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection connection;
	PreparedStatement psAddCategory;
	
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
			psAddCategory = connection.prepareStatement("INSERT INTO category (categoryName, categoryDescription, categoryImageUrl) values (?, ?, ?)");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
			if(psAddCategory == null) {
				psAddCategory.close();
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
		
		HttpSession session = request.getSession(false);
		if(session == null) {
			response.sendRedirect("login.html");
			return;
		}
		
		PrintWriter writer = response.getWriter();
		
		String categoryName = request.getParameter("categoryName");
		String categoryDescription = request.getParameter("categoryDescription");
		String categoryImageUrl = request.getParameter("categoryImageUrl");
		
		try {
			psAddCategory.setString(1, categoryName);
			psAddCategory.setString(2, categoryDescription);
			psAddCategory.setString(3, categoryImageUrl);
			
			int addCategoryResult = psAddCategory.executeUpdate();
			
			if(addCategoryResult > 0) {
				writer.println("category Added");
				response.sendRedirect("Categories");
				return;
			} else {
				writer.println("category not Added");
				response.sendRedirect("CategoryView");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			writer.println("category not Added");
//			e.printStackTrace();
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
