package servlet.paintings.service;

//import java.util.List;
import java.util.LinkedList;

import servlet.paintings.domain.*;

public class StorageService {
	
	private LinkedList <Artist> artists = new LinkedList <Artist>();
	private LinkedList <Location> locations = new LinkedList <Location>();
	private LinkedList <Painting> paintings = new LinkedList <Painting>();
	
	
	//C
	
	//Dodaje do tabeli artist i sprawdza czy byl juz podany ten rekord
	public void addArtist(Artist artist) {
		if (!artists.contains(artist)) {
			artists.add(new Artist(artist.getName(), artist.getYob(), artist.getYod()));
		}
	}
	
	//Dodaje do tabeli tabele location i sprawdza czy byl juz podany ten rekord
	public void addLocation(Location location) {
		if (!locations.contains(location)) {
			locations.add(new Location(location.getCountry(), location.getCity(), location.getPlase()));
		}
	}
	
	//Dodaje do tabeli painting i sprawdza czy byl juz podany ten rekord
	public void addPainting(Painting painting) {
		if (!paintings.contains(painting)) {
			paintings.add(new Painting(painting.getName(), painting.getYoc(), painting.getArtist(), painting.getLocation()));
		}
		
		//czy bylo juz podane miejsce location (powiazanie z locations)
		boolean b = false;
		for (Location item : locations) {
			if (item.getPlase().equals(painting.getLocation())) {
				b = true;
				break;
			}
		}
		if (!b) {
			locations.add(new Location(null, null, painting.getLocation()));
		}
		
		//czy byla juz nazwa artist (powiazanie z artists)
		b=false;
		for (Artist item : artists) {
			if (item.getName().equals(painting.getArtist())) {
				b = true;
				break;
			}
		}
		if (!b) {
			artists.add(new Artist(painting.getArtist(), 0, 0));
		}
	}
	
	
	
	
	//R
	// zwraca tabele
	
	public LinkedList<Artist> getArtists() {
		return artists;
	}
	
	public LinkedList<Location> getLocations() {
		return locations;
	}
	
	public LinkedList<Painting> getPaintings() {
		return paintings;
	}
	
	
	
	
	//U???????????
	
	public void updateArtist(int i, Artist artist) {
		artists.set(i, artist);
	}
	
	public void updateLocation(int i, Location location) {
		locations.set(i, location);
	}
	
	public void updatePainting(int i, Painting painting) {
		paintings.set(i, painting);
	}
	
	
	
	
	//D
	//Usuwa z tabel
	
	public void deleteArtist(Artist artist) {
		artists.remove(artist);
	}
	
	public void deleteLocation(Location location) {
		locations.remove(location);
	}
	
	public void deletePainting(Painting painting) {
		paintings.remove(painting);
	}
	
	
	
	
	
	
	
	
	
	
}
