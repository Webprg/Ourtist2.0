package admin.ourtist.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		
		public ArrayList getAllUsers(){
			ArrayList<Users> users = new ArrayList<>();
			
			String sql = "SELECT * FROM " + Users.TABLE_NAME;
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Users s = new Users();
					s.setEmail_address(rs.getString(Users.EMAIL_ADDRESS));
					s.setIdusers(rs.getInt(Users.ID_USERS));
					s.setMembership(rs.getInt(Users.MEMBERSHIP));
					s.setPassword(rs.getString(Users.PASSWORD));
					s.setUser_name(rs.getString(Users.USER_NAME));
					users.add(s);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			return users;
			
		}
		
		
		
}
