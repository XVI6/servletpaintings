package servlet.paintings.domain;

public class Artist {
	
	
	private String name = "unknown";
	private int yob = 0;
	private int yod = 0;
	
	
	public Artist() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Artist(String name, int yob, int yod) {
		super();
		this.name = name;
		this.yob = yob;
		this.yod = yod;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}
	
	

	public int getYod() {
		return yod;
	}

	public void setYod(int yod) {
		this.yod = yod;
	}
	

}
