<%@page import="java.util.List"%>
<%@page import="com.mvc.pojos.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	CATEGORIES
	<h1>
		WELCOME, <%= session.getAttribute("username") %>
	</h1>
	<%
		List<Category> categories = (List<Category>) request.getAttribute("categoryList");
		if (categories != null && !categories.isEmpty()) {
	%>
	<table border="1">
		<tr>
			<th>CATEGORY NAME</th>
			<th>CATEGORY DESCRIPTION</th>
			<th>CATEGORY IMAGE</th>
		</tr>
		<%
		for (Category category : categories) {
		%>
		<tr>
			<td><a href="<%= request.getContextPath() + "/products?categoryId=" + category.getCategoryId() %>"><%=category.getCategoryName()%></a></td>
			<td><%=category.getCategoryDescription()%></td>
			<td><%=category.getCategoryImageUrl()%></td>
		</tr>
		<%
		}
		%>

	</table>
	<%
	} else {
	%>
	<p>No categories available.</p>
	<%
	}
	%>
</body>
</html>