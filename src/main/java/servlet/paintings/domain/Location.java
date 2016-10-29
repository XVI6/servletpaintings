package servlet.paintings.domain;

public class Location {
	
	private String country = "unknown";
	private String city = "unknown";
	private String plase = "unknown";
	
	
	private Location(String plase, String country, String city) {
		this.country = country;
		this.city = city;
		this.plase = plase;
	}


	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	
	
	public String getPlase() {
		return plase;
	}


	public void setPlase(String plase) {
		this.plase = plase;
	}
	
}
