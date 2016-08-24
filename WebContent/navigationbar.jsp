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
                        <a class="page-scroll" href="DisplayArtworksServlet">Artworks</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="DisplayArtistsServlet">Artists</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="SubmitForm2.html">Submit</a>
                    </li>
                    
                    
					<c:if test="${param.ifloggedin == 'true'}">				
	     				<li>
	                        <a class="page-scroll" href="LogoutServlet">Logout</a>
	                    </li>
					 </c:if>
					<c:if test="${param.ifloggedin == 'false'}">		
					 <li>
                        <a class="page-scroll" href="login.jsp">Login</a>
                    </li>
					</c:if>
                   
                    <li>
                        <a class="page-scroll" href="Registration.jsp">Signup</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>