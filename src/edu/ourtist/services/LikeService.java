package edu.ourtist.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.ourtist.db.DBManager;
import edu.ourtist.javabean.Artworks;
import edu.ourtist.javabean.Like;

public class LikeService {

	
			public boolean isLiked(String uname,int idart){
			boolean st = false;
			int x = 0;
			String sql ="SELECT isliked FROM ourtist.like WHERE username= ? and idartwork= ? ";
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, uname);
				pstmt.setInt(2, idart);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					x = rs.getInt(1);
					
				}
				
				if(x == 0 )
					st = false;
				else
					st = true;
				System.out.println("boolean = " + st);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return st;
		}
			
			public void dolike(String uname,int idart){
				String sql = "UPDATE ourtist.like SET isliked = 1 WHERE username= ? and idartwork= ? ";
				Connection conn = null;
				PreparedStatement pstmt = null;
				
				try {
					conn = DBManager.getConnection();
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uname);
					pstmt.setInt(2, idart);
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
