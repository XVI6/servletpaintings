package servlet.paintings.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import servlet.paintings.domain.*;

public class StorageService {
	
	private LinkedList <Artist> artists = new LinkedList <Artist>();
	private LinkedList <Location> locations = new LinkedList <Location>();
	private LinkedList <Painting> paintings = new LinkedList <Painting>();
	
	
	
	//C
	
	//Dodaje do tabeli artist i sprawdza czy byl juz podany ten rekord
	public void addArtist(Artist artist) {
		
		Iterator<Artist> i = artists.iterator();
		boolean b = false;
		
		while (i.hasNext()) {
			Artist a = i.next();
			if (a.getName().equals(artist.getName())) {
				b = true;
				break;
			}
		}
		
		if (!b) {
			artists.add(new Artist(artist.getName(), artist.getYob(), artist.getYod()));			
		}
	}
	
	//Dodaje do tabeli tabele location i sprawdza czy byl juz podany ten rekord
	public void addLocation(Location location) {
		
		Iterator<Location> i = locations.iterator();
		boolean b = false;
		
		while (i.hasNext()) {
			Location l = i.next();
			if (l.getPlase().equals(location.getPlase())) {
				b = true;
				break;
			}
		}
		
		if (!b) {
			locations.add(new Location(location.getCountry(), location.getCity(), location.getPlase()));
		}
	}
	
	
	//Dodaje do tabeli painting i sprawdza czy byl juz podany ten rekord
	public void addPainting(Painting painting) {
		
		Iterator<Painting> i = paintings.iterator();
		boolean b = false;
		
		while (i.hasNext()) {
			Painting p = i.next();
			if (p.getName().equals(painting.getName())) {
				b = true;
				break;
			}
		}
		
		if (!b) {
			paintings.add(new Painting(painting.getName(), painting.getYoc(), painting.getArtist(), painting.getLocation()));	
		}
		
		
		//czy bylo juz podane miejsce location (powiazanie z locations)
		b = false;
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
	
	
	
	
	//U
	//Update tabel
	
	public void updateArtist(String name, Artist new_artist) {
		Iterator<Artist> i = artists.iterator();
		while (i.hasNext()) {
			Artist a = i.next();
			if (a.getName().equals(name)) {
				a.setName(new_artist.getName());
				a.setYob(new_artist.getYob());
				a.setYod(new_artist.getYod());
				break;
			}
		}	
	}
	
	public void updateLocation(String plase, Location new_location) {
		Iterator<Location> i = locations.iterator();
		while (i.hasNext()) {
			Location l = i.next();
			if (l.getPlase().equals(plase)) {
				l.setCountry(new_location.getCountry());
				l.setCity(new_location.getCity());
				l.setPlase(new_location.getPlase());
				break;
			}
		}
	}
	
	public void updatePainting(String name, Painting new_painting) {
		Iterator<Painting> i = paintings.iterator();
		while (i.hasNext()) {
			Painting p = i.next();
			if (p.getName().equals(name)) {
				p.setName(new_painting.getName());
				p.setYoc(new_painting.getYoc());
				p.setArtist(new_painting.getArtist());
				p.setLocation(new_painting.getLocation());
				break;
			}
		}
	}
	
	
	
	
	//D
	//Usuwa z tabel
	
	public void deleteArtist(Artist artist) {
		for(Artist a : artists) {
		  if(a.getName().equals(artist.getName())) {
		    artists.remove(a);
		    break;
		   }
		}
		
	}
	
	public void deleteLocation(Location location) {
		for(Location l : locations) {
			if(l.getPlase().equals(location.getPlase())) {
				locations.remove(l);
				break;
		   }
		}
	}
	
	public void deletePainting(Painting painting) {
		for(Painting p : paintings) {
			if(p.getName().equals(painting.getName())) {
				paintings.remove(p);
				break;
		   }
		}
	}
	
	
	
	//find
	//znaiduje rekord o podanych danych
	public ArrayList<Artist> findArtists(Artist artist) {
		
		Iterator<Artist> iterArtist = artists.iterator();
		ArrayList<Artist> a = new ArrayList<Artist>();
		
		while (iterArtist.hasNext()) {
			Artist art = iterArtist.next();
			if (art.getName().equals(artist.getName()) || art.getYob()==artist.getYob() ||  art.getYod()==artist.getYod()) {
				a.add(art);	
			}			
		}
		return a;
	}
	
	
	public ArrayList<Location> findLocations(Location location) {
		
		Iterator<Location> iterLocation = locations.iterator();
		ArrayList<Location> l = new ArrayList<Location>();
		
		while (iterLocation.hasNext()) {
			Location loc = iterLocation.next();
			if (loc.getCountry().equals(location.getCountry()) || loc.getCity().equals(location.getCity()) || loc.getPlase().equals(location.getPlase())) {
				l.add(loc);	
			}			
		}
		return l;
	}
	
	public ArrayList<Painting> findPaintings(Painting painting) {
		
		Iterator<Painting> iterPaintings = paintings.iterator();
		ArrayList<Painting> p = new ArrayList<Painting>();
		
		while (iterPaintings.hasNext()) {
			Painting paint = iterPaintings.next();
			if (paint.getName().equals(painting.getName()) || paint.getArtist().equals(painting.getArtist()) || paint.getLocation().equals(painting.getLocation())) {
				p.add(iterPaintings.next());	
			}			
		}
		return p;
	}	
}