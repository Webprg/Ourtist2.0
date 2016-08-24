package edu.ourtist.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ourtist.javabean.Artworks;
import edu.ourtist.services.ArtworksService;

/**
 * Servlet implementation class SearchArtworksServlet
 */
@WebServlet("/SearchArtworksServlet")
public class SearchArtworksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchArtworksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*ArtworksService ArtworksService = new ArtworksService();
		ArrayList<Artworks> artworks = ArtworksService.getSelectedArtworks(doPost(request, response););
		
		request.setAttribute("artworkslists", artworks);
		
		request.getRequestDispatcher("searchartworks.jsp").forward(request,response);*/
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Artworks a = new Artworks();
		a.setName(request.getParameter(Artworks.NAME));
		ArtworksService artworksService = new ArtworksService();
		ArrayList<Artworks> artworks = artworksService.getSelectedArtworks(a);

		request.setAttribute("artworkslists", artworks);

		
		request.getRequestDispatcher("searchartworks.jsp").forward(request,response);
		
		
	}

}
;