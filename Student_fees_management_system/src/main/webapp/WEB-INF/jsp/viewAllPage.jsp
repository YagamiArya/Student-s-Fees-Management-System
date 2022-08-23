<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>View Students</title>
</head>
<body>
<br>
<h2 class="text-center">Student's Fees Management System</h2>
<div class="container">
	<h3>View Students</h3>
	<br>
	<div class="text-center">
		<table class="table table-hover">
			<thead class="table-dark">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>class of study</th>
					<th>Fees amount</th>
					<th>Payment amount</th>
					<th>Payment status</th>
					<th>Payment Date</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${students }" var="student" >
				<tr>
					<td>${student.id }</td>
					<td>${student.name }</td>
					<td>${student.class_of_study }</td>
					<td>${student.fees_amount }</td>
					<td>${student.payment_amount }</td>
					<td>${student.payment_status }</td>
					<td>${student.payment_date }</td>
					<td><a href="editStudent?id=${student.id }" class="btn btn-success" >Edit</a></td>
					<td><a href="deleteStudent?id=${student.id }" class="btn btn-danger" >Delete</a></td>
				</tr>
			</c:forEach>
			
			</tbody>
		</table>
</div>
<a href="add" class="btn btn-outline-primary">Add Student</a>
</div>
</body>
</html>






