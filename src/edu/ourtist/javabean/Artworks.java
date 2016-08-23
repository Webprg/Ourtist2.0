package edu.ourtist.javabean;

public class Artworks {
	public static final String TABLE_NAME = "artworks";
	public static final String NAME = "name";
	public static final String ARTISTS = "artist"; 
	public static final String DESCRIPTION = "description";
	public static final String LOCATION = "location";
	public static final String LIKES = "likes";
	public static final String ID_ARTWORKS = "idartworks";
	
	private String location;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private int idartworks;
	public int getIdartworks() {
		return idartworks;
	}
	public void setIdartworks(int idartists) {
		this.idartworks = idartists;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	private String name;
	private String artists;
	private String description;
	private int likes;


}
