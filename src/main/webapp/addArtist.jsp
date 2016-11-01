<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add Artist</title>
</head>
	<body>
		<jsp:useBean id="artist" class="servlet.paintings.domain.Artist" scope="session"></jsp:useBean>
		<jsp:setProperty property="*" name="artist"/>
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		
		
		<% storage.addArtist(artist); %>
		
		<p>Following person has been added to storage: </p>
		<p>First name: ${artist.name} </p>
		<p>Year of birth: ${artist.yob}</p>
		<p>Year of death: ${artist.yod}</p>
		<p>
		  <a href="showAll.jsp">Show all</a>
		</p>
		
	</body>
</html>