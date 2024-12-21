<%@page import="java.util.List"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.shop.pojos.Users"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	System.out.println(userName);
	System.out.println(password);

	SessionFactory hibernateFactory = (SessionFactory) application.getAttribute("hibernateFactory");

	try (Session hibernateSession = hibernateFactory.openSession();) {
		Query<Users> loginQuery = hibernateSession
		.createQuery("FROM Users user WHERE user.userName = :userName AND user.password = :password", Users.class);
		System.out.println("loginQuery : " + loginQuery.getQueryString());
		loginQuery.setParameter("userName", userName);
		loginQuery.setParameter("password", password);
		List<Users> userList = loginQuery.getResultList();
		if (!userList.isEmpty()) {
			Users user = userList.get(0);
			System.out.println(user.getUserName());
			System.out.println(user.getPassword());
			response.sendRedirect("category.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>

</body>
</html>