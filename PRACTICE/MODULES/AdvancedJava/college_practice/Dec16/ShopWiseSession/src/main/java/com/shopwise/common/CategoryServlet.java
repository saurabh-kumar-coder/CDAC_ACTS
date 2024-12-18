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
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/Categories")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psCategoryList;
	ResultSet categoryListResult;

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
			psCategoryList = connection.prepareStatement("SELECT * FROM category");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
			if (psCategoryList != null) {
				psCategoryList.close();
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
		HttpSession session = request.getSession(false);
		try {
			categoryListResult = psCategoryList.executeQuery();
			if (session == null) {
				response.sendRedirect("login.html");
				return;
			}
			String username = (String) session.getAttribute("username");

			try {
				writer.println("<html><body>");
				writer.println("Welcome <b>" + username + "</b><br />");
				writer.println("<table border=2>" + "<tr>" + "<th>category name</th>" + "<th>category description</th>"
						+ "<th>category image</th>" + "</tr>");
				while (categoryListResult.next()) {
					writer.println("<tr>");
					writer.println("<td><a href='Product?categoryId=" + categoryListResult.getString("categoryId") + "'>"
							+ categoryListResult.getString("categoryName") + "</a></td>");
					writer.println("<td>" + categoryListResult.getString("categoryDescription") + "</td>");
					writer.println("<td><img width='60px' height='60px' src='Images/"
							+ categoryListResult.getString("categoryImageUrl") + "' alt='"
							+ categoryListResult.getString("categoryDescription") + "'></td>");
					writer.println("</tr>");

				}
				writer.println("</table></body></html>");
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

	}

}
