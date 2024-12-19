<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Page</h1>
	<form action="confirmRegistration.jsp" method="post">
		<input type="text" name="userName" /><br />
		<input type="text" name="password" /><br />
		<input type="text" name="name" /><br />
		<input type="text" name="email" /><br />
		<input type="submit" value="Register" /><br />
 		<a href="index.jsp">Login ?</a>
	</form>
</body>
</html>