package edu.ourtist.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ourtist.services.ArtworksService;
import edu.ourtist.services.LikeService;

/**
 * Servlet implementation class VoteServlet
 */
@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//like an artwork
			// 1. check if the logged in (jsp file)
			 //2. check if the user already voted the artwork
		PrintWriter out = response.getWriter();
				LikeService lk = new LikeService();
				ArtworksService ArtworksService = new ArtworksService();
				String uname = request.getParameter("username");
				String idart = request.getParameter("idartwork");
				System.out.println(uname);
				System.out.println(idart);
				if(lk.isLiked(uname, Integer.parseInt(idart)) == false){
					//add vote and update isvote
					ArtworksService.addVote(Integer.parseInt(idart));
					lk.dolike(uname, Integer.parseInt(idart));
				}else{
					   out.println("<script type=\"text/javascript\">");
					   out.println("alert('You Already Voted');");
					   out.println("location='DisplayArtworksServlet';");
					   out.println("</script>");
				}
				
				request.getRequestDispatcher("DisplayArtworksServlet").forward(request,response);
				
			 //3. if steps 1 and 2 passed add votes to the db artwork
			 //4. update user is liked in db  -->
		
	}

}
