<%@page import="servlet.paintings.domain.Location"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Show Locations</title>
	</head>
	<body>
		
		
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:useBean id="location" class="servlet.paintings.domain.Location" scope="session"></jsp:useBean>
		<jsp:setProperty property="*" name="location"/>
		
		<p><h2>Locations</h2></p>
		<p>
			<%	
			for(Location l: storage.findLocations(location)){
				out.println("<p>Counrty: " + l.getCountry() + "; City: " + l.getCity() + "; Plase: " + l.getPlase() + "</p>");
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