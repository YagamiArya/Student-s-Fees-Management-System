<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Add Student</title>
</head>
<body>
<div class="container"> 
	<h2 class="text-center">Add Student</h2>
	<br>
	<pre>
		<form action="addStudent" method="post">
			id: <input name="id" type="text"> <br>
			Name: <input name="name" type="text"><br>
			Class: <input name="class_of_study" type="text"><br>
			Fees Amount: <input name="fees_amount" type="text"><br>
			Payment Amount: <input name="payment_amount" type="text"><br>
			Payment Status: <input name="payment_status" type="text">
			
			<input type="submit" class="btn btn-primary" value="Add Student"><br>
			<a href="viewStudents" class="btn btn-primary">Return to Students</a>
		</form>
	</pre>
	<div>
		${msg}
	</div>
</div>
</body>
</html>