package edu.ourtist.javabean;

import java.io.Serializable;

public class Users implements Serializable{
	
	public static final String TABLE_NAME = "users";
	public static final String USER_NAME = "user_name";
	public static final String PASSWORD = "password";
	public static final String EMAIL_ADDRESS = "email_address";
	public static final String ID_USERS = "idusers"; 
	public static final String MEMBERSHIP = "membership";
	
	private int idusers;
	private String user_name;
	private String password;
	private String email_address;
	private int membership;
	
	public int getIdusers() {
		return idusers;
	}
	public void setIdusers(int idusers) {
		this.idusers = idusers;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public int getMembership() {
		return membership;
	}
	public void setMembership(int membership) {
		this.membership = membership;
	}
	
	
	

}
