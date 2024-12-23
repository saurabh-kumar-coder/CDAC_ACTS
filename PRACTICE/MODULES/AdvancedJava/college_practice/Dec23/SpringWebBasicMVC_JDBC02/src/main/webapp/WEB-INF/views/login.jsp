<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="authenticate" modelAttribute="objUser">
		User Name : <form:input path="userName" />
		Password :  <form:input path="password" />
		<form:button value="submit">LOGIN</form:button>
	</form:form>
</body>
</html>