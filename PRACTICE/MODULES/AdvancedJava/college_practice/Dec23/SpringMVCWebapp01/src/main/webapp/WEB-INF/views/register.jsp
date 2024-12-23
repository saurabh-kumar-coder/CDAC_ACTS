<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="reguser" modelAttribute="objUser">
		username : <form:input path="userName"/><br/>
		password : <form:input path="password"/><br/>
		mobile : <form:input path="mobile"/><br/>
		firstName : <form:input path="firstName"/><br/>
		lastName : <form:input path="lastName"/><br/>
		email : <form:input path="email"/><br/>
		<form:button value="submit">RIGISTER</form:button>
	</form:form>
</body>
</html>