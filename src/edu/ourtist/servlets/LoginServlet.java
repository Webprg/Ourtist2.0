package edu.ourtist.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin.ourtist.services.AdminService;
import edu.ourtist.services.UsersService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("username");
		String pword = request.getParameter("password");
		
		if(UsersService.Validate(uname, pword)){
			Cookie cookie = new Cookie("LoggedUser",uname);
			cookie.setMaxAge(60*60*60);
			response.addCookie(cookie);
			cookie.setComment(uname);
			response.sendRedirect("index.jsp");
			
	        
		}
		else{
			 out.println("<script type=\"text/javascript\">");
			 out.println("alert('User or password incorrect');");
			 out.println("location='login.html';");
			 out.println("</script>");
		}
		
	}

}
