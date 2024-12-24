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
	REGISTER
	<form:form action="register" modelAttribute="objUser" >
		username: <form:input path="username"/><form:errors path="username" cssStyle="color:red" /> <br/>
		password: <form:input path="password"/><form:errors path="password" cssStyle="color:red" /><br/>
		mobile: <form:input path="mobile"/><form:errors path="mobile" cssStyle="color:red" /> <br/>
		firstname: <form:input path="firstname"/><form:errors path="firstname" cssStyle="color:red" /><br/>
		lastname: <form:input path="lastname"/><form:errors path="lastname" cssStyle="color:red" /> <br/>
		email: <form:input path="email"/><form:errors path="email" cssStyle="color:red" /><br/>
		<form:button value="submit" >register</form:button>
	</form:form>
	<a href="/SpringBootMVCHibernate03/login">login</a>
</body>
</html>