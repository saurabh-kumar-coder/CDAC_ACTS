<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userObj" class="com.shopping.pojo.User" scope="session" />
	
	<jsp:setProperty property="*" name="userObj"/>
	
	username : <jsp:getProperty property="userName" name="userObj"/>
	password : <jsp:getProperty property="password" name="userObj"/>
	name : <jsp:getProperty property="name" name="userObj"/>
	email : <jsp:getProperty property="email" name="userObj"/>
	<jsp:forward page="addUserToDB.jsp"></jsp:forward>
</body>
</html>