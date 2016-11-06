<%@ page import="servlet.paintings.domain.Artist" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Show Atrist</title>
	</head>
	<body>
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:useBean id="artist" class="servlet.paintings.domain.Artist" scope="session"></jsp:useBean>
		<jsp:setProperty property="*" name="artist"/>
		
		
		
		<p><h2>Artists</h2></p>
		<p>
			<%	
			for(Artist a : storage.findArtists(artist)){
				out.print("<p>Name: " + a.getName() + "; Year of birth: " + a.getYob() + "; Year of death: " + a.getYod() + "</p>");
			}
			
			%>
		</p>
		
		
		<p>
		  <a href="index.jsp">Another record</a>
		</p>
		
		<p>
		  <a href="showAll.jsp">Show all</a>
		</p>
		
	</body>
</html>