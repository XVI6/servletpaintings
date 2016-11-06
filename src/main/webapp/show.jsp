<%@ page import="servlet.paintings.domain.Artist" %>
<%@ page import="servlet.paintings.domain.Location" %>
<%@ page import="servlet.paintings.domain.Painting" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:useBean id="artist" class="servlet.paintings.domain.Artist" scope="session"></jsp:useBean>
		<jsp:useBean id="painting" class="servlet.paintings.domain.Painting" scope="session"></jsp:useBean>
		<jsp:useBean id="location" class="servlet.paintings.domain.Location" scope="session"></jsp:useBean>
		<jsp:setProperty property="*" name="painting"/>
		<jsp:setProperty property="*" name="artist"/>
		<jsp:setProperty property="*" name="location"/>
		
		
		
		<p><h2>Artists</h2></p>
		<p>
			<%
			/*
			  while(storage.findArtists(artist).hasNext()){
				  out.println("<p>Name: " + artist.getName() + "; Year of birth: " + artist.getYob() + "; Year of death: " + artist.getYod() + "</p>");
			  }
			*/
			%>
		</p>
		
		
		<p><h2>Paintings</h2></p>
		<p>
			<%
			/*
			  while(storage.findPaintings(painting).hasNext()) {
				  out.println("<p>Picture name: " + painting.getName() + "; Year of creation: " + painting.getYoc() + "; Artist: " + painting.getArtist() + "; Location: " + painting.getLocation() + "</p>");
			  }
			*/
			%>
		</p>
		
		<p><h2>Locations</h2></p>
		<p>
		<!-- 
			<%
			/*
			  while(storage.findLocations(location).hasNext()) {
				  out.println("<p>Counrty: " + location.getCountry() + "; City: " + location.getCity() + "; Plase: " + location.getPlase() + "</p>");
			  }
			*/
			%>		
		 -->
		</p>
		
		
		<p>
		  <a href="index.jsp">Another record</a>
		</p>
		
		<p>
		  <a href="showAll.jsp">Show all</a>
		</p>
		
		
	</body>
</html>