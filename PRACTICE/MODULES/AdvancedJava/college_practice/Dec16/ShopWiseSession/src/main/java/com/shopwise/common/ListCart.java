package com.shopwise.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import com.shopwise.pojos.CartItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LIstCart
 */
@WebServlet("/ListCart")
public class ListCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("login.html");
			return;
		}
		String username = (String) session.getAttribute("username");
		writer.println("<html><body>");
		writer.println("Welcome <b>" + username + "</b><br />");

		List<CartItem> item = (List<CartItem>) session.getAttribute("cart");

		writer.println("<table border=2>" + "<tr>" + "<th>category id</th>" + "<th>product id</th>"
				+ "<th>product Price</th>" + "</tr>");
		int total = 0;
		if (item == null) {
			writer.println("cart is null");
		} else {
			Iterator<CartItem> itr = item.iterator();
			while (itr.hasNext()) {
				CartItem cartItem = itr.next();
				writer.println("<tr>" + "<td>" + cartItem.getCategoryId() + "</td>" + "<td>" + cartItem.getProductId()
						+ "</td>" + "<td>" + cartItem.getPrice() + "</td>" + "</tr>");
				total += cartItem.getPrice();
			}
			writer.println("<tr> Total : " + total + "</tr>");
		}
		writer.println("<a href='AddCardView'>Add Card</a><br />");
		writer.println("</table>" + "<a href=''>Checkout</a><br />" + "<a href='Logout'>LOGOUT</a>" + "</body>" + "</html>");
		session.setAttribute("totalPriceForCheckOut", total);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
