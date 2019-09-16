<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<h2 style="text-align: center; color: blue;">LOGIN</h2>

	<form action="/loginAction" method="post">

		<input type="text" name="username" placeholder="Enter username"required /><br/>
		<input type="password" name="password" placeholder="Enter password" required /><br/>
		
		<input type="submit" value="Submit" />

	</form>
</body>
</html>