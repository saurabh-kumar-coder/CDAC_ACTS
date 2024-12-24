<%@page import="com.mvc.pojos.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	CATEGORIES

	<table border="1">
		<tr>
			<th>CATEGORY NAME</th>
			<th>CATEGORY DESCRIPTION</th>
			<th>CATEGORY IMAGE</th>
		</tr>

		<c:forEach var="category" items="${categoryList}">
			<tr>
				<th>${category.categoryName}</th>
				<th>${category.categoryDescription }</th>
				<th>${category.categoryImageUrl }</th>
			</tr>
		</c:forEach>
	</table>

</body>
</html>