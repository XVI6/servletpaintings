package servlet.paintings.domain;

public class Painting {
	
	private String name = "unknown";
	private int yoc = 0;
	
	public Painting(String name, int yoc) {
		this.name = name;
		this.yoc = yoc;
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
	
}
