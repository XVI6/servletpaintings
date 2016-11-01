package servlet.paintings.domain;

public class Painting {
	
	private String name = "unknown";
	private int yoc = 0;
	protected String artist;
	protected String location;
	
	public Painting(String name, int yoc, String artist, String location) {
		this.name = name;
		this.yoc = yoc;
		this.artist = artist;
		this.location = location;
	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public int getYoc() {
		return yoc;
	}

	public void setYoc(int yoc) {
		this.yoc = yoc;
	}
	
	
	

	public String getArtist() {
		return artist;
	}

	public void String(String artist) {
		this.artist = artist;
	}
	
	
	
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String plase) {
		this.location = plase;
	}
	
	
}
