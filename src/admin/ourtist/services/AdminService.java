package admin.ourtist.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.ourtist.javabean.Users;
import edu.ourtist.db.DBManager;

public class AdminService {

	
		public static boolean Validate(String uname, String password){
			boolean st = false;
			String sql ="SELECT * FROM ourtist.users WHERE user_name=? and password=? and membership=?; ";
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, uname);
				pstmt.setString(2, password);
				pstmt.setInt(3, 1);
				ResultSet rs =pstmt.executeQuery();
				st = rs.next();
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
			 return st; 
			
		}
}
