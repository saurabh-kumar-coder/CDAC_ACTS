package com.shopwise.auth;

import java.io.IOException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.shopwise.pojos.Users;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Authentication
 */
@WebServlet("/Authentication")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		ServletContext application = getServletContext();
		SessionFactory hibernateFactory = (SessionFactory)application.getAttribute("hibernateFactory");
		
		try (Session hibernateSession = hibernateFactory.openSession()) {
			System.out.println("username : " + userName);
			Query<Users> findUserById = hibernateSession.createQuery("from Users u WHERE u.userName = :userName", Users.class);
			findUserById.setParameter("userName", userName);
			List<Users> users = findUserById.getResultList();
			Users user = users.get(0);
			if(password.equals(user.getPassword())) {
				response.sendRedirect("category.jsp");
				return;
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("login.jsp");
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
