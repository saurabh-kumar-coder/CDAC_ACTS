<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
	String DB_DRIVER = application.getInitParameter("DB_DRIVER");
	String DB_URL = application.getInitParameter("DB_URL");
	String USERNAME = application.getInitParameter("USERNAME");
	String PASSWORD = application.getInitParameter("PASSWORD");
	Class.forName(DB_DRIVER);
	Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
	PreparedStatement psAuth = connection
			.prepareStatement("SELECT userName, password FROM users WHERE userName = ? AND password = ?");

	String username = request.getParameter("username");
	String password = request.getParameter("password");

	psAuth.setString(1, username);
	psAuth.setString(2, password);

	ResultSet resultAuth = psAuth.executeQuery();

	if (resultAuth.next()) {
		session.setAttribute("username", resultAuth.getString("userName"));
	%>
	<jsp:forward page="category.jsp"></jsp:forward>
	return;
	<%
	} else {
	%>
	<jsp:forward page="index.jsp"></jsp:forward>
	return;
	<%
	}
	%>
</body>
</html>




