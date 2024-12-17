package com.shop.servlet.admin;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/AddProducts")
public class AddProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psInsertProduct;
	PreparedStatement psGetCategoryIds;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);

		try {
			ServletContext application = getServletContext();
			String driver = application.getInitParameter("driver");
			String url = application.getInitParameter("url");
			String username = application.getInitParameter("username");
			String password = application.getInitParameter("password");
			Class.forName(driver);

			connection = DriverManager.getConnection(url, username, password);

			psInsertProduct = connection.prepareStatement(
					"INSERT INTO products (categoryId, productName, productDescription, productPrice, productImageUrl) values (?, ?, ?, ?, ?)");
			psGetCategoryIds = connection.prepareStatement("select categoryId from category");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			if (psInsertProduct != null) {
				psInsertProduct.close();
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
		PrintWriter writer = response.getWriter();
		writer.println("get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		String productName = request.getParameter("productName");
		String productDescription = request.getParameter("productDescription");
		int productPrice = Integer.parseInt(request.getParameter("productPrice"));
		String productImageUrl = request.getParameter("productImageUrl");
		System.out.println("In product add table");
		try {
			if (categoryId == 0 || productName != null || productDescription != null || productPrice == 0 || productImageUrl != null) {
				response.sendRedirect("addProduct.html");
			} else {
				psInsertProduct.setInt(1, categoryId);
				psInsertProduct.setString(2, productName);
				psInsertProduct.setString(3, productDescription);
				psInsertProduct.setInt(2, productPrice);
				psInsertProduct.setString(3, productImageUrl);

				int result = -1;
				try {
					result = psInsertProduct.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(psInsertProduct);
				if (result > 0)
					response.sendRedirect("adminHome.html");
				else {
					response.sendRedirect("addProduct.html");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error inside add products");
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error inside add products");
//			e.printStackTrace();
		}

	}

}
