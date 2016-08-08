<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script src = "jquery-3.0.0.min.js"></script>
</head>
<body>
	<form action = "AddUsersServlet" method = "POST">
		Username: <input type = "text" name = "user_name" />
		Password <input type = "password" name = "password" />
		Email Address: <input type = "text" name = "email_address" />
		<input type = "submit" />
	</form>
</body>
</html>