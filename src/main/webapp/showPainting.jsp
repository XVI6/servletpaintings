<%@page import="java.util.ArrayList"%>
<%@page import="servlet.paintings.domain.Painting"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Show Paintings</title>
	</head>
	<body>
		
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:useBean id="painting" class="servlet.paintings.domain.Painting" scope="session"></jsp:useBean>
		<jsp:setProperty property="*" name="painting"/>
		
		
		
		<p><h2>Paintings</h2></p>
		<p>
			<%	
			ArrayList <Painting> paint = storage.findPaintings(new Painting(painting.getName(),painting.getYoc(),painting.getArtist(),painting.getLocation()));
			for(Painting p : paint){
				out.println("<p>Picture name: " + p.getName() + "; Year of creation: " + p.getYoc() + "; Artist: " + p.getArtist() + "; Location: " + p.getLocation() + "</p>");
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