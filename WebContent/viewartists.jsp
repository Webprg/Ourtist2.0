<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Agency - Start Bootstrap Theme</title>
	
	<script src = "jquery-3.0.0.min.js"></script>
	
    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="css/agency.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        .navbar-custom{
            background-color: #222;
        }
    </style>
</head>

<body id="page-top" class="index">

    <!-- Navigation -->
    <c:import url="navigationbar.jsp">
  		<c:param name="ifloggedin" value="${ifloggedin}"/>
	</c:import>
    
    
    <section id="portfolio" class="bg-light-gray">
        <div class="container">
        <h1>Artists</h1>
			</div>
    <br><br>
    <div class="container">
      <div class="row">
            <div class="col-md-7">
                <a href="#">
                    <img class="img-responsive" src="images/try1.jpg" alt="" style="min-height:50px;height:300px; min-width: 20px;width:700px;">
                </a>
            </div>
            <div class="col-md-5">
                <h3 >Featured Artist</h3>
                <h4>Artist Name</h4>
                <p>Description of Artist.</p>
            </div>
      </div>
      <br>
      <div class="row">
        <c:forEach items = "${artistslists}" var = "a">
			<div class="col-sm-6 col-md-4">
          <div class="thumbnail">
            <img src="images/${a.filename}" alt="Painting" style="min-height:50px;height:166px; min-width: 20px;width:450px;">
            <div class="caption">
              <h3 style = "margin:3px; text-align:center;width:100%">${a.name} <br></h3>
              <p style = "margin:3px; text-align:center;width:100%">${a.phone_number}<br>
			${a.email_address}<br>
			${a.info}<br>
			${a.views}<br> <br> <br></p>
            </div>
          </div>
        </div>

		</c:forEach>
      </div>
    </div>
    
    <br><br><br><br>
    
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <span class="copyright">Copyright &copy; Ourtist 2016</span>
                </div>
                <div class="col-md-4">
                    <ul class="list-inline social-buttons">
                        <li><a href="#"><i class="fa fa-twitter"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a>
                        </li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <ul class="list-inline quicklinks">
                        <li><a href="#">Privacy Policy</a>
                        </li>
                        <li><a href="#">Terms of Use</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
        
        <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/agency.min.js"></script>

    </section>    
    </body>
    </html>