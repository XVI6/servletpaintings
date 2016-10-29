package servlet.paintings.service;

//import java.util.ArrayList;
//import java.util.List;
import java.util.LinkedList;

import servlet.paintings.domain.*;

public class StorageService {
	
	private LinkedList <Artist> artists = new LinkedList <Artist>();
	private LinkedList <Location> locations = new LinkedList <Location>();
	private LinkedList <Painting> paintings = new LinkedList <Painting>();
	
	
	
	
	//C
	
	public void addArtist(Artist artist) {
		artists.add(artist);
	}
	
	public void addLocation(Location location) {
		locations.add(location);
	}
	
	public void addPainting(Painting painting) {
		paintings.add(painting);
	}
	
	
	
	
	//R
	
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
