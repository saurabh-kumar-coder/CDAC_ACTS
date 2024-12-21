<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	LOGIN PAGE
	<form action="authenticate.jsp" method="post">
		username : <input type="text" name="userName" />
		password : <input type="text" name="password" />
		<input type="submit" value="login" />
	</form>
</body>
</html>