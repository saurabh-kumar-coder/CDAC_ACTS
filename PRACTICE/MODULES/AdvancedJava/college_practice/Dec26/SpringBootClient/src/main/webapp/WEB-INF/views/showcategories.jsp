<%@page import="java.util.Iterator"%>
<%@page import="com.fasterxml.jackson.databind.JsonNode"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border='1'>
		<tr>
			<th>Category Name</th>
			<th>Category Description</th>
			<th>Category Image</th>
		</tr>
		<%
		String jsonCategories = (String) request.getAttribute("categories");
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(jsonCategories);
		Iterator<JsonNode> categories = root.iterator();
		while (categories.hasNext()) {
			JsonNode category = categories.next();
			String categoryName = category.path("categoryName").asText();
			String categoryDescription = category.path("categoryDescription").asText();
			String categoryImageUrl = category.path("categoryImageUrl").asText();
		%>
		<tr>
			<td><%=categoryName%></td>
			<td><%=categoryDescription%></td>
			<td><%=categoryImageUrl%></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="showcategories?pageNo=<%=Integer.parseInt(request.getParameter("pageNo"))-1 %>&pageSize=<%=Integer.parseInt(request.getParameter("pageSize"))%>">previous</a> 
	<a href="showcategories?pageNo=<%=Integer.parseInt(request.getParameter("pageNo"))+1 %>&pageSize=<%=Integer.parseInt(request.getParameter("pageSize"))%>">next</a>
</body>
</html>