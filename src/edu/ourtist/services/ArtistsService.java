package edu.ourtist.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

import edu.ourtist.javabean.Artists;
import edu.ourtist.db.DBManager;


public class ArtistsService {
	
	public ArrayList getAllArtists(){
		
		ArrayList<Artists> artistslists = new ArrayList<>();
		
		String sql = "SELECT * FROM " + Artists.TABLE_NAME;
		
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
				Artists a = new Artists();
				a.setEmail_address(rs.getString(Artists.EMAIL_AD));
				a.setName(rs.getString(Artists.NAME));
				a.setPhone_number(rs.getString(Artists.PHONE_NUMBER));
				a.setInfo(rs.getString(Artists.INFO));
				a.setViews(rs.getInt(Artists.VIEWS));
				a.setIdartists(rs.getInt(Artists.ID_ARTISTS));
				artistslists.add(a);
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
		
		return artistslists;
		
	}

}
