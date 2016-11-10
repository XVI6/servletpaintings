<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Update Painting</title>
	</head>
	<body>
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:setProperty property="*" name="painting"/>
		<jsp:useBean id="painting" class="servlet.paintings.domain.Painting" scope="session"></jsp:useBean>
		
		<% storage.addPainting(painting); %>
			
			<h2>Following artist has been in storage now:</h2>
			
			<p>Following painting has been in storage now: </p>
			<p>Painting name : ${painting.name} </p>
			<p>Year of creation : ${painting.yoc}</p>
			<p>Artist name : ${painting.artist}</p>
			<p>Painting location :${painting.location}</p>
			
			<p>
		  	<a href="showAll.jsp">Show all</a>
			</p>
		
	</body>
</html>