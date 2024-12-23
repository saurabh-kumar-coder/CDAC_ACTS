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
	<form:form action="register" modelAttribute="objUser">
		User Name : <form:input path="userName" />
		Password :  <form:input path="password" />
		Mobile : <form:input path="mobile" />
		firstName : <form:input path="firstName" />
		lastName : <form:input path="lastName" />
		email : <form:input path="email" />
		<form:button value="submit">register</form:button>
	</form:form>
</body>
</html>