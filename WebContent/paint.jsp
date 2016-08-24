<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Agency - Start Bootstrap Theme</title>

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
    
	<c:forEach items="${cookie}" var="IdCookie">
     <c:if test="${IdCookie.key == 'LoggedUser'}">
     	<c:set var="ifloggedin" value="true"/>
     		<% System.out.println(pageContext.findAttribute("ifloggedin")); %>
     </c:if>
     </c:forEach>
     
    
</head>

<body id="page-top" class="index">

    <!-- Navigation -->
    <c:import url="navigationbar.jsp">
  		<c:param name="ifloggedin" value="${ifloggedin}"/>
	</c:import>
    
    <section id="portfolio" class="bg-light-gray">
    <div class = "container">
            <div class = "col-md-8">
                <div class = "panel panel-default">
                
 	
			 <div class = "panel-heading"><c:out value="${artwork[0].name}" /></div>
                    <div class = "panel-body">
                        <img src = "img/portfolio/art1.jpg" alt="" id = "image">
                    </div>
                </div>
            </div>
            <div class = "col-md-4">
                <div class = "panel-group" id = "accordion">
                    <div class="panel panel-default">
                        <div class = "panel-heading">
                            <h4 class="panel-title">
                                <a href = "#collapseone" data-toggle = "collapse" data-parent = "accordion">Description</a>
                            </h4>
                        </div>
                        <div id="collapseone" class="panel-collapse collapse in">
                            <div class="panel-body">
                                ${artwork[0].description}
                            </div>
                        </div>
                    </div>
                </div>
                
                    <div class="panel panel-default">
                        <div class = "panel-heading">
                            <h4 class="panel-title">
                                <a href = "#collapsetwo" data-toggle = "collapse" data-parent = "accordion">Artist Info</a>
                            </h4>
                        </div>
                        <div id="collapsetwo" class="panel-collapse collapse">
                            <div class="panel-body">
                                ${artwork[0].artists}
                            </div>
                        </div>
                    </div>
                
                    <a href = "" class = "btn btn-primary btn-lg"><span class = "glyphicon glyphicon-thumbs-up"></span></a>
                
                    <a href = "" class = "btn btn-success btn-lg"><span class = "glyphicon glyphicon-share"></span></a>

                    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Zoom</button>

                    <div class="modal fade" id="myModal" role="dialog">
                        <div class="modal-dialog modal-lg">
                        
                          <!-- Modal content-->
                          <div class="modal-content">
                            <div class="modal-header">
                              <button type="button" class="close" data-dismiss="modal">&times;</button>
                              <h4 class="modal-title">Title</h4>
                            </div>
                            <div class="modal-body">
                              <img src = "img/portfolio/art1.jpg" alt="" id = "image" style="min-height:50px;height:498px; min-width: 20px;width:862px;">
                            </div>
                            <div class="modal-footer">
                              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                          </div>       
                        </div>
                    </div>
                
                </div>
    </div>
  <br><br><br><br><br>

   <%@ include file="footer.jsp" %>
    </section>       
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

     
    </body>
    </html>