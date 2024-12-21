<%@page import="java.util.List"%>
<%@page import="com.shop.pojos.Category"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
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
	SessionFactory hibernateFactory = (SessionFactory) application.getAttribute("hibernateFactory");
	try (Session hibernateSession = hibernateFactory.openSession();) {

		Query<Category> findAllCategory = hibernateSession.createQuery("FROM Category", Category.class);
		List<Category> categoryList = findAllCategory.getResultList();
	%>

	<table border='1'>
		<tr>
			<th>category name</th>
			<th>category Description</th>
			<th>category image</th>
		</tr>
		<%
		for (Category category : categoryList) {
		%>
		<tr>
			<td><a href="products.jsp?categoryId=<%= category.getCategoryId()%>"><%=category.getCategoryName()%></a></td>
			<td><%=category.getCategoryDescription()%></td>
			<td><%=category.getCategoryImageUrl()%></td>
		</tr>
		<%
		}
		;
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
	</table>
</body>
</html>


<!-- 
	-->