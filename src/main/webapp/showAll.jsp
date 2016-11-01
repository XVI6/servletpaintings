<%@ page import="servlet.paintings.domain.Artist" %>
<%@ page import="servlet.paintings.domain.Location" %>
<%@ page import="servlet.paintings.domain.Painting" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Show all data</title>
	</head>
	
	<body>
		
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application" />
		
		<%
		  for (Artist artist : storage.getArtists()) {
			  out.println("<p>Name: " + artist.getName() + "; Year of birth: " + artist.getYob() + "; Year of death: " + artist.getYod() + "</p>");
		  }
		%>
		
		
		
		<%
		  for (Painting painting : storage.getPaintings()) {
			  out.println("<p>Picture name: " + painting.getName() + "; Year of creation: " + painting.getYoc() + "; Artist: " + painting.getArtist() + "; Location: " + painting.getLocation() + "</p>");
		  }
		%>
		
		
		
		<%
		  for (Location location : storage.getLocations()) {
			  out.println("<p>Counrty: " + location.getCountry() + "; City: " + location.getCity() + "; Plase: " + location.getPlase() + "</p>");
		  }
		%>
		
		
		
		<p>
		  <a href="add.jsp">Add another record</a>
		</p>
		

		
	</body>

</html>