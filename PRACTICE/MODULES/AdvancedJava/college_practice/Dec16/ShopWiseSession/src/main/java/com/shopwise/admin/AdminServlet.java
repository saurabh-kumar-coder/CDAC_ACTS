package com.shopwise.admin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/Admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		if(session == null) {
			response.sendRedirect("login.html");
			return;
		}
		String username = (String)session.getAttribute("username");
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Welcome <B>" + username.toUpperCase() + "</B>");
		writer.println("<br />");
		writer.println("<a href='AddProduct'>Add Products</a>");
		writer.println("<br />");
		writer.println("<a href='DeleteProduct'>Delete Products</a>");
		writer.println("<br />");
		writer.println("<a href='CategoryView'>Add Category</a>");
		writer.println("<br />");
		writer.println("<a href='Categories'>Show Categories</a>");
		writer.println("<br />");
		writer.println("<a href='ListCart'>Show Cart</a>");
		writer.println("<br />");
		writer.println("</body>");
		writer.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("post");
	}

}
