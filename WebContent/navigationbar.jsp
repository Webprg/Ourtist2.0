<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="index.jsp">OURtist</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class=" navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                    	<form action="SearchArtworksServlet" class="navbar-form navbar-right" role="search" method = "POST">
		                    <div class="input-group" id = "searchid">
		                    <input type="text" class="form-control" placeholder = "Search" name = "name"/>
		                        <input type = "submit" href = "index.html" button type = "submit"class="btn btn-primary"/>
		                    </div>
		                </form>
		                
		                s
                    </li>
                    <li>
                        <a class="page-scroll" href="DisplayArtworksServlet">Artworks</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="DisplayArtistsServlet">Artists</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="SubmitForm2.html">Submit</a>
                    </li>
                    
                    <c:choose>
						
					 <c:when test="${param.ifloggedin == 'true'}">			
	     				<li>
	                        <a class="page-scroll" href="LogoutServlet">Logout</a>
	                    </li>
	                    </c:when>
					 
					 
					 <c:otherwise>		
					 <li>
                        <a class="page-scroll" href="login.jsp">Login</a>
                    </li>
					</c:otherwise>
					</c:choose>
                   
                    <li>
                        <a class="page-scroll" href="Registration.jsp">Signup</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>