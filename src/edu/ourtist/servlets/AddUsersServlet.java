package edu.ourtist.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ourtist.javabean.Users;
import edu.ourtist.services.UsersService;

/**
 * Servlet implementation class AddUsersServlet
 */
@WebServlet("/AddUsersServlet")
public class AddUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUsersServlet() {
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
		
		UsersService usersService = new UsersService();
		Users u = new Users();	
		String n = request.getParameter(Users.USER_NAME);
		if(usersService.getSimilarName(n) == 1){
			System.out.println("existsssssssss");
			request.getRequestDispatcher("Error.html").forward(request, response);
		}
		
		else{
			u.setUser_name(request.getParameter(Users.USER_NAME));
			u.setPassword(request.getParameter(Users.PASSWORD));
			u.setEmail_address(request.getParameter(Users.EMAIL_ADDRESS));
			
			usersService.addUsers(u);
			
			out.println("<script type=\"text/javascript\">");
			 out.println("alert('Your are now registered in');");
			 
			 out.println("</script>");	
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		
	}

}
