package edu.ourtist.javabean;

import java.io.Serializable;

public class Like implements Serializable {
	
	public static final String TABLE_NAME = "like";
	public static final String USERNAME = "username";
	public static final String ISLIKED = "isliked"; 
	
	
	private int userid;
	private int artworkid;
	private int isliked;
	
	public Like() {
		
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getArtworkid() {
		return artworkid;
	}
	public void setArtworkid(int artworkid) {
		this.artworkid = artworkid;
	}
	public int getIsliked() {
		return isliked;
	}
	public void setIsliked(int isliked) {
		this.isliked = isliked;
	}

}
