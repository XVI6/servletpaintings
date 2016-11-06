<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Find record</title>
	</head>
	<body>
		
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:useBean id="artist" class="servlet.paintings.domain.Artist" scope="session"></jsp:useBean>
		<jsp:useBean id="location" class="servlet.paintings.domain.Location" scope="session"></jsp:useBean>
		<jsp:useBean id="painting" class="servlet.paintings.domain.Painting" scope="session"></jsp:useBean>
		
		<form action="showArtist.jsp">
			
			<h2>Find Artist</h2>
			Name : <input type="text" name="name" value="${artist.name}" >
			Year of birth :<input type="text"  name="yob" value="${artist.yob}" >
			Year of death :<input type="text"  name="yod" value="${artist.yod}" >
  			<input type="submit" value=" OK ">
			 
		</form>
		
		<form action="showPainting.jsp">
			
			<h2>Find Painting</h2>
			Painting name : <input type="text" name="name" value="${painting.name}" >
			Year of creation :<input type="text"  name="yoc" value="${painting.yoc}" >
			Artist name :<input type="text"  name="artist" value="${painting.artist}" >
  			Painting location :<input type="text"  name="location" value="${painting.location}" >
  			<input type="submit" value=" OK ">
			 
		</form>
		
		<form action="showLocation.jsp">
			
			<h2>Find Location</h2>
			Country :<input type="text" name="country" value="${location.country}">
			City :<input type="text" name="city" value="${location.city}">
			Plase :<input type="text" name="plase" value="${location.plase}">
			<input type="submit" value=" OK ">
			
		</form>
		
	</body>
</html>