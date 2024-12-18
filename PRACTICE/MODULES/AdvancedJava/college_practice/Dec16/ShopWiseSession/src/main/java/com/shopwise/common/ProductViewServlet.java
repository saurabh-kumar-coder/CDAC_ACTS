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
 * Servlet implementation class ProductViewServlet
 */
@WebServlet("/Product")
public class ProductViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;
	PreparedStatement psProductList;

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
			psProductList = connection.prepareStatement("SELECT * FROM products WHERE categoryId = ?");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
			if (psProductList == null) {
				psProductList.close();
			}
			if (connection == null) {
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

		String categoryId = request.getParameter("categoryId");
		try {
			psProductList.setString(1, categoryId);
			HttpSession session = request.getSession(false);
			if (session == null) {
				response.sendRedirect("login.html");
				return;
			}
			String username = (String) session.getAttribute("username");
			try (ResultSet productListByCategory = psProductList.executeQuery()) {
				writer.println("<html><body>");
				writer.println("Welcome <b>" + username + "</b><br />");
				writer.println("<table border=2>" + "<tr>" + "<th>category name</th>" + "<th>category description</th>"
						+ "<th>product Price</th>" + "<th>category image</th>" + "<th>Operation</th>" + "</tr>");
				if (productListByCategory != null) {
					while (productListByCategory.next()) {
						writer.println("<tr>");
						writer.println("<td>" + productListByCategory.getString("productName") + "</a></td>");
						writer.println("<td>" + productListByCategory.getString("productDescription") + "</td>");
						writer.println("<td>" + productListByCategory.getString("productPrice") + "</td>");
						writer.println("<td><img width='60px' height='60px' src='Images/"
								+ productListByCategory.getString("productImageUrl") + "' alt='"
								+ productListByCategory.getString("productDescription") + "'></td>");
						writer.println("<td><a href='AddCart?categoryId="
								+ productListByCategory.getString("categoryId") + "&productId="
								+ productListByCategory.getString("productId") + "&productPrice="
								+ productListByCategory.getString("productPrice") + "'>" + "Add To Cart" + "</a></td>");
						writer.println("</tr>");

					}
					writer.println("</table></body></html>");
				} else {
					writer.println("No data found");
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
