package com.saurabh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetContactPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		
		String contactUsHtml = "<html>"
				+ "<body>"
				+ "<h1>Contact Us</h1>"
				+ "</body>"
				+ "</html>";
		
		out.println(contactUsHtml);
	}
	
}
