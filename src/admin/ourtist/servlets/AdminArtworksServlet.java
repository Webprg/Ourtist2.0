package admin.ourtist.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.ourtist.services.AdminService;
import edu.ourtist.javabean.Artworks;
import edu.ourtist.javabean.Users;
import edu.ourtist.services.ArtworksService;

/**
 * Servlet implementation class AdminArtworksServlet
 */
@WebServlet("/AdminArtworksServlet")
public class AdminArtworksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminArtworksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArtworksService artworkservice = new ArtworksService();
		ArrayList<Artworks> artlist = artworkservice.getAllArtworks();
		request.setAttribute("artworklist", artlist);
		request.getRequestDispatcher("AdminArtworks.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
