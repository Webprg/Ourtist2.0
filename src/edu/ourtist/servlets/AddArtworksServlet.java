package edu.ourtist.servlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import edu.ourtist.javabean.Artworks;
import edu.ourtist.services.ArtworksService;

/**
 * Servlet implementation class AddArtworksServlet
 */
@WebServlet("/AddArtworksServlet")
@MultipartConfig
public class AddArtworksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//this is where to change the directory
	static String location  = "/Users/Edward/Desktop/WEB-PRG Study/OURtist2/WebContent/images/";
	public static File FOLDER = new File(location);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddArtworksServlet() {
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
		
		Part part = request.getPart("filename");
		
		String fileName = System.currentTimeMillis() + "-image.jpg";
		System.out.println(fileName);
		String title = request.getParameter("title");
		System.out.println("title : " + title);
		
	    File file = new File(FOLDER, fileName);
		
		
		InputStream fileInputStream = part.getInputStream();
		Files.copy(fileInputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
		fileInputStream.close();
		
		Artworks a = new Artworks();
		a.setName(request.getParameter(Artworks.NAME));
		a.setArtists(request.getParameter(Artworks.ARTISTS));
		a.setDescription(request.getParameter(Artworks.DESCRIPTION));
		a.setLocation(request.getParameter(Artworks.LOCATION));
		a.setFilename(fileName);
		ArtworksService artworksService = new ArtworksService();
		artworksService.addArtworks(a);
		
		request.getRequestDispatcher("index.html").forward(request, response);
	}

}
