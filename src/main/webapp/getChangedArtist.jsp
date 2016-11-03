<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Get new Artist</title>
</head>
<body>
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:setProperty property="*" name="artist"/>
		<jsp:useBean id="artist" class="servlet.paintings.domain.Artist" scope="session"></jsp:useBean>
		
	<form action="updArtist.jsp">
		<% storage.deleteArtist(artist); %>
		
		<h2>Update Artist</h2>
		<h5>To:</h5>
		Name : <input type="text" name="name" value="${artist.name}" >
		Year of birth :<input type="text"  name="yob" value="${artist.yob}" >
		Year of death :<input type="text"  name="yod" value="${artist.yod}" >
			<input type="submit" value=" OK ">
	</form>
	
</body>
</html>