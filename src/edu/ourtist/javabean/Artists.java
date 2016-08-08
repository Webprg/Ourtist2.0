package edu.ourtist.javabean;

public class Artists {
	public static final String TABLE_NAME = "artists";
	public static final String NAME = "name";
	public static final String PHONE_NUMBER = "phone_number";
	public static final String INFO = "info";
	public static final String VIEWS = "views";
	public static final String ID_ARTISTS = "idartists";
	
	private int idartists;
	private String name;
	private String phone_number;
	private String info;
	private int views;
	
	public int getIdartists() {
		return idartists;
	}

	public void setIdartists(int idartists) {
		this.idartists = idartists;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getViews() {
		return views;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
