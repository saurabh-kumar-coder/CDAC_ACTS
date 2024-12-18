package com.shopwise.common;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AddCardView
 */
@WebServlet("/AddCardView")
public class AddCardView extends HttpServlet {
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
		writer.println("<form action='AddCardDetails' method='post'>"
				+ "<input type='text' name='cardNo' placeholder='card number' /><br />"
				+ "<input type='text' name='balance' placeholder='balance' /><br />"
				+ "<input type='text' name='expiry' placeholder='expiry' /><br />"
				+ "<input type='submit' value='submit' />" 
				+ "</form>");
		writer.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
