<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Get Painting</title>
	</head>
	<body>
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:useBean id="painting" class="servlet.paintings.domain.Painting" scope="session"></jsp:useBean>
		
		<form action="addPainting.jsp">
			
			<h2>Add Painting</h2>
			Painting name : <input type="text" name="name" value="${painting.name}" >
			Year of creation :<input type="text"  name="yoc" value="${painting.yoc}" >
			Artist name :<input type="text"  name="artist" value="${painting.artist}" >
  			Painting location :<input type="text"  name="location" value="${painting.location}" >
  			<input type="submit" value=" OK ">
			 
		</form>
		
		
		
		<form action="getChangedPainting.jsp">
			
			<h2>Update Painting</h2>
			<h5>Change:</h5>
			Painting name : <input type="text" name="name" value="${painting.name}" >
			Year of creation :<input type="text"  name="yoc" value="${painting.yoc}" >
			Artist name :<input type="text"  name="artist" value="${painting.artist}" >
  			Painting location :<input type="text"  name="location" value="${painting.location}" >
  			<input type="submit" value=" OK ">
			
		</form>
		
		
		
		<form action="delPainting.jsp">
			
			<h2>Delete Painting</h2>
			Painting name : <input type="text" name="name" value="${painting.name}" >
			Year of creation :<input type="text"  name="yoc" value="${painting.yoc}" >
			Artist name :<input type="text"  name="artist" value="${painting.artist}" >
  			Painting location :<input type="text"  name="location" value="${painting.location}" >
  			<input type="submit" value=" OK ">
			
		</form>
	</body>
</html>