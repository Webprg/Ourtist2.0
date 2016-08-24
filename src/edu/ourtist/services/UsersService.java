package edu.ourtist.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

import edu.ourtist.db.DBManager;
import edu.ourtist.javabean.Users;

public class UsersService {
	
	
	public void addUsers(Users u){
		String sql = "INSERT INTO " + Users.TABLE_NAME +" ("
				+ Users.USER_NAME + ","
				+ Users.PASSWORD + ","
				+ Users.EMAIL_ADDRESS + ")"
				+ "VALUES (?,?,?)";
		
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/ourtist");
		bds.setUsername("root");
		bds.setPassword("p@ssword");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			
			conn = bds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getUser_name());
			pstmt.setString(2, u.getPassword());
			pstmt.setString(3, u.getEmail_address());
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
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
	
	public void loginUsers(Users u){
		String sql = "SELECT * FROM " + Users.TABLE_NAME + "WHERE user_name like " 
				+ "VALUES (?)";
		
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/ourtist");
		bds.setUsername("root");
		bds.setPassword("p@ssword");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			
			conn = bds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getEmail_address());
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
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
			pstmt.setInt(3, 0);
			ResultSet rs =pstmt.executeQuery();
			st = rs.next();
			System.out.println("Wawaka" + st);
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
