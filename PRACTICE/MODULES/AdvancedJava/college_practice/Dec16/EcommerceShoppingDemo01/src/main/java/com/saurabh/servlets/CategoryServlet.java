package com.saurabh.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/Category")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		serviceImpl(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		serviceImpl(request, response);
	}

	private void serviceImpl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root",
					"tiger");
					PreparedStatement psGetCategoriesData = connection.prepareStatement("SELECT * FROM category");) {
				ResultSet categoriesResult = psGetCategoriesData.executeQuery();
				if (categoriesResult != null) {
					out.println("<html>");
					out.println("<body>");
					out.println("<table border='2px' solid black'>");

					out.println("<tr>");

					out.println("<th>");
					out.println("Category Name");
					out.println("</th>");

					out.println("<th>");
					out.println("Description");
					out.println("</th>");

					out.println("<th>");
					out.println("Image");
					out.println("</th>");

					out.println("</tr>");
					while (categoriesResult.next()) {
						out.println("<tr>");

						out.println("<td>");
						out.println("<a href='Products?categoryId=" + categoriesResult.getString("categoryId") + "'>"
								+ categoriesResult.getString("categoryName") + "</a>");
						out.println("</td>");

						out.println("<td>");
						out.println(categoriesResult.getString("categoryDescription"));
						out.println("</td>");
						out.println("<td>");
						out.println("<img height='60px' width='60px' src='Images/"
								+ categoriesResult.getString("categoryImageUrl") + "' alt='"
								+ categoriesResult.getString("categoryDescription") + "'/>");
						out.println("</td>");

						out.println("</tr>");
					}

					out.println("</table>");
					out.println("</body>");
					out.println("</html>");
				} else {
					out.println("No Data FOUND");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
