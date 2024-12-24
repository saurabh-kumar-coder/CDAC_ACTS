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
	<form:form action="login" modelAttribute="objUser" >
		username: <form:input path="username"/><form:errors path="username" cssStyle="color:red" /> <br/>
		password: <form:input path="password"/><form:errors path="password" cssStyle="color:red" /><br/>
		<form:button value="submit" >login</form:button>
	</form:form>
	<a href="/SpringBootMVCHibernate03/register">register</a>
</body>
</html>