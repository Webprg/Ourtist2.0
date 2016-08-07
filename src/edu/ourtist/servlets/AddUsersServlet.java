package edu.ourtist.servlets;

import java.io.IOException;

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
		
		Users u = new Users();
		u.setUser_name(request.getParameter(Users.USER_NAME));
		u.setPassword(request.getParameter(Users.PASSWORD));
		u.setEmail_address(request.getParameter(Users.EMAIL_ADDRESS));
		UsersService usersService = new UsersService();
		usersService.addUsers(u);
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

}
