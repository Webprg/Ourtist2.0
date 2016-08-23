package edu.ourtist.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

import edu.ourtist.db.DBManager;
import edu.ourtist.javabean.Artists;
import edu.ourtist.javabean.Artworks;

public class ArtworksService {
	
	public ArrayList getSelectedArtworks(Artworks a){
		ArrayList<Artworks> artworkslists = new ArrayList<>();
		String sql = "SELECT * FROM" + Artworks.TABLE_NAME + " WHERE " + 
		Artworks.NAME + " LIKE" + " \"?\" ";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a.getName());
			rs = pstmt.executeQuery();
			while(rs.next()){
				//song s = new song();
				Artworks ab = new Artworks();
				//String title = rs.getString(song.COLUMN_TITLE);
				//s.setTitle(title);
				//s.setArtist(rs.getString(song.COLUMN_ARTIST));
				//s.setGenre(rs.getString(song.COLUMN_GENRE));
				//s.setTrackNum(rs.getInt(song.COLUMN_TRACKNUM));
				//s.setIdsong(rs.getInt(song.COLUMN_IDSONG));
				//songs.add(s);
				ab.setName(rs.getString(Artworks.NAME));
				ab.setArtists(rs.getString(Artworks.ARTISTS));
				ab.setDescription(rs.getString(Artworks.DESCRIPTION));
				ab.setLikes(rs.getInt(Artworks.LIKES));
				ab.setLocation(rs.getString(Artworks.LOCATION));
				ab.setIdartworks(rs.getInt(Artworks.ID_ARTWORKS));
				ab.setFilename(rs.getString(Artworks.FILENAME));
				artworkslists.add(ab);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return artworkslists;
	}
	
	
	public ArrayList getAllArtworks(){
		ArrayList<Artworks> artworkslists = new ArrayList<>();
		
		String sql = "SELECT * FROM " + Artworks.TABLE_NAME;
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				//song s = new song();
				Artworks a = new Artworks();
				//String title = rs.getString(song.COLUMN_TITLE);
				//s.setTitle(title);
				//s.setArtist(rs.getString(song.COLUMN_ARTIST));
				//s.setGenre(rs.getString(song.COLUMN_GENRE));
				//s.setTrackNum(rs.getInt(song.COLUMN_TRACKNUM));
				//s.setIdsong(rs.getInt(song.COLUMN_IDSONG));
				//songs.add(s);
				a.setName(rs.getString(Artworks.NAME));
				a.setArtists(rs.getString(Artworks.ARTISTS));
				a.setDescription(rs.getString(Artworks.DESCRIPTION));
				a.setLikes(rs.getInt(Artworks.LIKES));
				a.setLocation(rs.getString(Artworks.LOCATION));
				a.setIdartworks(rs.getInt(Artworks.ID_ARTWORKS));
				a.setFilename(rs.getString(Artworks.FILENAME));
				System.out.println(a.getFilename());
				artworkslists.add(a);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return artworkslists;
	}

}
