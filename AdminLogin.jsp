<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href="css/admin-style.css">
		<script type="text/javascript" src="js/jquery-3.0.0.js"></script>
		<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css">
		<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css">
		
		<style>
			body{
				background-color:#27ae60;
				
			}
			.container{
				width:500px;
				height:200px;
				 position: relative;
				top: 50%;
  				transform: translateY(-50%);
				
			}
		
			.jumbotron li{
				list-style-type: none;
			}
		
		</style>
		

</head>
<body>
<div class="container">
		<div class="jumbotron">
			<form action="AdminLoginServlet" method="POST">
				<ul>
					<li><label>Username:</label>
						<input type="text" name="username" Required></li>
					<li><label>Password:</label>
						<input type="password" name="password" Required></li>
					<li><input type="submit"></li>
				</ul>
			</form>
		</div>
	</div>
	
</body>
</html>