package servlet.paintings.domain;

public class Painting {
	
	private String name = "unknown";
	private int yoc = 0;
	protected Artist artist;
	protected Location location;
	
	public Painting(String name, int yoc, Artist artist, Location location) {
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
	
	
	

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	
	
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
