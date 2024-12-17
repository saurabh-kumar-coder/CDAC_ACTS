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
@WebServlet("/CategoryView")
public class CategoryInputView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession(false);
		if(session == null) {
			response.sendRedirect("login.html");
			return;
		}
		String username = (String)session.getAttribute("username");
		writer.println("<html><body>");
		writer.println("Welcome <b>" + username + "</b><br />");
		writer.println("Add Category\n"
				+ "	<form action=\"AddCategory\" method=\"post\">\n"
				+ "		<input type=\"text\" name=\"categoryName\" placeholder=\"category name\" />\n"
				+ "		<input type=\"text\" name=\"categoryDescription\" placeholder=\"category description\" /> \n"
				+ "		<input type=\"text\" name=\"categoryImageUrl\" placeholder=\"category image\" /> \n"
				+ "		<input type=\"submit\" value=\"add category\" />\n"
				+ "	</form>");
		writer.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
