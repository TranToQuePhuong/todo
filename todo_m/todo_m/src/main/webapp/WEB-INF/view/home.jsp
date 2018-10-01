<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<tr>
				<th>No.</th>
				<th>Name</th>
				<th>Status</th>
				<th>Start Date</th>
				<th>Started At</th>
				<th>Ended At</th>
				<th>Actions</th>
			</tr>
			<%
				int i = 1;
			%>
			<c:forEach var="todo" items="${todo}">
				<tr class="${todo.status}">
					<td><%=i++%></td>
					<td>${todo.name}</td>
					<td>${todo.status}</td>
					<td>${todo.startDate}</td>
					<td>${todo.startAt}</td>
					<td>${todo.endAt }</td>
					<td>Action</td>
		</c:forEach>
	</table>
</body>
</html>