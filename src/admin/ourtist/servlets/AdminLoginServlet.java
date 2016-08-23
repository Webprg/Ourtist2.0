package admin.ourtist.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin.ourtist.services.AdminService;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
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
		
		
		String admin_uname = request.getParameter("username");
		String admin_pword = request.getParameter("password");
		
		if(AdminService.Validate(admin_uname, admin_pword)){
			

			HttpSession session=request.getSession();  
	        session.setAttribute("name",admin_uname); 
			request.getRequestDispatcher("Admin.jsp").forward(request, response);
	        
		}
		else{
			System.out.println("validated >>");
			 out.println("<script type=\"text/javascript\">");
			 out.println("alert('User or password incorrect');");
			 out.println("location='AdminLogin.jsp';");
			 out.println("</script>");
		}
			
		
		
	}

}
