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
		if(session == null) {
			response.sendRedirect("index.jsp");
			return;
		}
	%>
	<%
		String username = (String)session.getAttribute("username");
	%>
	WELCOME <b style="color: red;"><%=username.toUpperCase() %></b> TO CATEGORY
	

</body>
</html>