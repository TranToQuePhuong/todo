<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<table id="example" class="table">
		<thead>
			<tr>
				<th>No.</th>
				<th>Name</th>
				<th>Status</th>
				<th>Start Date</th>
				<th>Started At</th>
				<th>Ended At</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<%
				int i = 1;
			%>
			<c:forEach var="todoM" items="${todoM}">
				<tr class="${todo.status}">
					<td><%=i++%></td>
					<td>${todoM.id}</td>
					<td>${todoM.name}</td>
					<td>${todoM.startDate}</td>
					<td>${todoM.startedAt}</td>
					<td>${todoM.endedAt }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script src="<spring:url value='/resources/js/jquery-3.3.1.js' />"></script>
	<script
		src="<spring:url value='/resources/js/jquery.dataTables.min.js' />"></script>
	<script
		src="<spring:url value='/resources/js/dataTables.bootstrap.min.js' />"></script>
	

</body>
</html>