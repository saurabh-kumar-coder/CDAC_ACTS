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
 * Servlet implementation class ProductsServlet
 */
@WebServlet("/Products")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root",
				"tiger"); 
				PreparedStatement psGetProductByCategory = connection.prepareStatement("SELECT * FROM products WHERE categoryId = ?");
				) {
			int categoryId = Integer.parseInt(request.getParameter("categoryId"));
			psGetProductByCategory.setInt(1, categoryId);
			try (ResultSet productResult = psGetProductByCategory.executeQuery()) {
				if(productResult != null) {
					out.println("<html>");
					out.println("<body>");
					out.println("<table border='2px' solid black'>");
					
					out.println("<tr>");
					
					out.println("<th>");
					out.println("Product Name");
					out.println("</th>");
					
					out.println("<th>");
					out.println("Description");
					out.println("</th>");
					
					out.println("<th>");
					out.println("Price");
					out.println("</th>");
					
					out.println("<th>");
					out.println("Image");
					out.println("</th>");
					
					out.println("</tr>");
					while (productResult.next()) {
						out.println("<tr>");
						
						out.println("<td>");
						out.println(productResult.getString("productName"));
						out.println("</td>");
						
						out.println("<td>");
						out.println(productResult.getString("productDescription"));
						out.println("</td>");
						
						out.println("<td>");
						out.println(productResult.getString("productPrice"));
						out.println("</td>");
						
						out.println("<td>");
						out.println("<img height='60px' width='60px' src='Images/"
								+ productResult.getString("productImageUrl") + "' alt='"
								+ productResult.getString("productDescription") + "'/>");
						out.println("</td>");
						
						out.println("</tr>");
					}
					
					out.println("</table>");
					out.println("</body>");
					out.println("</html>");
				} else {
					out.println("no data found");
				}
			}
		} catch(SQLException e) {}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
