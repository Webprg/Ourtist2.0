<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/admin-style.css">
	<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css">
	<% if(session.getAttribute("name") == null){
		response.sendRedirect("AdminLogin.jsp");
		return;	
	}
	
	%>
</head>
<body>
<div id="header">
			
	</div>
	<div class="container-fluid body">
		
		<div class="row">
			<div class="col-md-2 col-xs-2 left-side">
				<ul class="sidebar-nav">
                
                <li>
                    <a href="AdminUsersServlet">Users</a>
                </li>
                <li>
                    <a href="#">Arts</a>
                </li>
                <li>
                    <a href="#">Votes</a>
                </li>
                <li>
                    <a href="AdminLogoutServlet">LogOut</a>
                </li>
                
            </ul>
				
				
			</div>
			<div class="col-md-10 col-xs-10 right-side">
			
			<table>
				<tr>
					<th>ID Users</th>
					<th>Username</th>
					<th>Password</th>
					<th>Email</th>
					<th>Membersip</th>
				</tr>
				<c:forEach items = "${userlist }" var ="u">
					<tr>
						<td>${u.idusers }</td>
						<td>${u.user_name }</td>
						<td>${u.password }</td>
						<td>${u.email_address }</td>
						<td>${u.membership }</td>
					</tr>
				</c:forEach>
			
			
			</table>
				
			
			
			</div>
		
		</div>
		
		
	</div>
</body>
</html>