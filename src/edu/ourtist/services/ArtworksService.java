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
		String sql = "SELECT * FROM " + Artworks.TABLE_NAME + " WHERE " + 
		Artworks.NAME + " LIKE" + " ? ";
		String what;
		System.out.println(a.getName());
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			what = "%" + a.getName() + "%";
			pstmt.setString(1, what);
			System.out.println(pstmt);
			rs = pstmt.executeQuery();
			while(rs.next()){
				
				Artworks ab = new Artworks();
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
		
	public ArrayList getArtWork(int id){
		ArrayList<Artworks> artwork = new ArrayList<>();
		
		String sql = "SELECT * FROM " + Artworks.TABLE_NAME + " WHERE " + Artworks.ID_ARTWORKS + " = " + id;
		
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/ourtist");
		bds.setUsername("root");
		bds.setPassword("p@ssword");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = bds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				//song s = new song();
				Artworks a = new Artworks();
				a.setName(rs.getString(Artworks.NAME));
				a.setArtists(rs.getString(Artworks.ARTISTS));
				a.setDescription(rs.getString(Artworks.DESCRIPTION));
				a.setLocation(rs.getString(Artworks.LOCATION));
				a.setLikes(rs.getInt(Artworks.LIKES));
				a.setIdartworks(rs.getInt(Artworks.ID_ARTWORKS));
				artwork.add(a);
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
		
		return artwork;
	}
	
	public void addVote(int id){
		String sql = "UPDATE " + Artworks.TABLE_NAME + " SET likes = likes + 1 WHERE idartworks = ? ";
		Connection conn = null;
		PreparedStatement pstmt = null;
			
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
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
		String sql = "SELECT * FROM " + Artworks.TABLE_NAME + " WHERE " + 
		Artworks.NAME + " LIKE" + " ? ";
		String what;
		System.out.println(a.getName());
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			what = "%" + a.getName() + "%";
			pstmt.setString(1, what);
			System.out.println(pstmt);
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
		
	public ArrayList getArtWork(int id){
		ArrayList<Artworks> artwork = new ArrayList<>();
		
		String sql = "SELECT * FROM " + Artworks.TABLE_NAME + " WHERE " + Artworks.ID_ARTWORKS + " = " + id;
		
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/ourtist");
		bds.setUsername("root");
		bds.setPassword("p@ssword");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = bds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				//song s = new song();
				Artworks a = new Artworks();
				a.setName(rs.getString(Artworks.NAME));
				a.setArtists(rs.getString(Artworks.ARTISTS));
				a.setDescription(rs.getString(Artworks.DESCRIPTION));
				a.setLocation(rs.getString(Artworks.LOCATION));
				a.setLikes(rs.getInt(Artworks.LIKES));
				a.setIdartworks(rs.getInt(Artworks.ID_ARTWORKS));
				artwork.add(a);
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
		
		return artwork;
	}
	
	public void addArtworks(Artworks a){
		
		String sql = "INSERT INTO " + Artworks.TABLE_NAME + " ("
				+ Artworks.NAME + ","
				+ Artworks.ARTISTS + ","
				+ Artworks.DESCRIPTION + ","
				+ Artworks.LOCATION + ","
				+ Artworks.FILENAME + ")"
				+ "VALUES (?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a.getName());
			pstmt.setString(2, a.getArtists());
			pstmt.setString(3, a.getDescription());
			pstmt.setString(4, a.getLocation());
			pstmt.setString(5, a.getFilename());
			pstmt.executeUpdate();
		} catch (SQLException e){
			e.printStackTrace();			
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
	
	public ArrayList getTopArtworks(){
		ArrayList<Artworks> artworkslists = new ArrayList<>();
		
		String sql = "SELECT * FROM " + Artworks.TABLE_NAME +
				" ORDER by likes desc limit 0,6";
		
		
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
