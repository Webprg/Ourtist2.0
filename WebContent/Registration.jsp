<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/sign_up.css">
		<script type="text/javascript" src="js/jquery-3.0.0.js"></script>
		<link rel="stylesheet" href="css/Slider.css">
    <link rel="stylesheet" href="css/style.css">
    <script type="text/javascript" src="js/jssor.slider.min.js"></script>
    <link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css">
<script src = "jquery-3.0.0.min.js"></script>
<title>Insert title here</title>
</head>
<header>
		
	<div class="navbar navbar-default navbar-fixed-top navbar-inverse">
        <div class = "container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
              <a href="#" class="navbar-left"></a>
            </div>
            <div class="collpase navbar-collapse" id="example">
                <ul class="nav navbar-nav">
                    <li><a href="index.html">OURtist</a></li>
                    <li><a href="index.html"><span class = "glyphicon glyphicon-home"></span></a></li> 
                    <li><a href="Artworks.html">Artworks</a></li>
                    <li><a href="Artists.html">Artists</a></li>
					<li><a href="SubmitForm.html">Submit your art</a></li>
                    
                </ul>
              
                
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="sign_up.html"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
                
                  
                 <form action="" class="navbar-form navbar-right" role="search">
                    <div class="input-group" id = "searchid">
                    <input type="text" class="form-control" placeholder = "Search"/>
                        <span class="input-group-addon">
                            <i class="fa fa-search"></i>
                            <a href="Artworks.html"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>
                        </span>
                    </div>
                </form>
               
        </div>
        </div>
    </div>
	</header>
	<body>
		<br><br><br><br>
        <div class="container">
				<h1>Sign Up / Register</h1>
			</div> 
	
	<body>
		<br>
		
        <div class="container">
        <!--  <form action = "AddUsersServlet" method = "POST">
              <fieldset class="form-group">
                <label for="formGroupExampleInput"></label>
                <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Username" name = "user_name">
              </fieldset>
              <fieldset class="form-group">
                <label for="formGroupExampleInput2"></label>
                <input type="password" class="form-control" id="formGroupExampleInput2" placeholder="Password">
              </fieldset>
              <fieldset class="form-group">
                <label for="formGroupExampleInput2"></label>
                <input type="password" class="form-control" id="formGroupExampleInput2" placeholder="Re-type password" name = "password">
              </fieldset>
              <fieldset class="form-group">
                <label for="formGroupExampleInput"></label>
                <input type="text" class="form-control" id="formGroupExampleInput" placeholder="E-mail" name = "email_address">
              </fieldset>
             
         //     <a href = "index.html" input type = "submit" class="btn btn-primary">Register</a>
        </form>-->
        <form action = "AddUsersServlet" method = "POST">
		<fieldset class="form-group">
                <label for="formGroupExampleInput"></label>
                <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Username" name = "user_name">
        </fieldset>
		<fieldset class="form-group">
          <label for="formGroupExampleInput2"></label>
          <input type="password" class="form-control" id="formGroupExampleInput2" placeholder="Re-type password" name = "password">
        </fieldset>
        <fieldset class="form-group">
          <label for="formGroupExampleInput"></label>
          <input type="text" class="form-control" id="formGroupExampleInput" placeholder="E-mail" name = "email_address">
        </fieldset>
		<input type = "submit" href = "index.html" button type = "submit"class="btn btn-primary"/>
		</form>
    </div>
	
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    
    <footer>
        <div class="container">
            <div class="row">
        <hr>
            <div class="col-lg-12">
      
            <div class="col-md-8">
                <p class="muted pull-right">© 2016 Burugs. All rights reserved</p>
            </div>
            </div>
            </div>
        </div>
        
        
    </footer>
	
	</body>


</html>