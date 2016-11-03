<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Get Location</title>
	</head>
	<body>
		
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
		<jsp:useBean id="location" class="servlet.paintings.domain.Location" scope="session"></jsp:useBean>
		<jsp:useBean id="location2" class="servlet.paintings.domain.Location" scope="session"></jsp:useBean>
		
		<form action="addLocation.jsp">
			
			<h2>Add Location</h2>
			Country :<input type="text" name="country" value="${location.country}">
			City :<input type="text" name="city" value="${location.city}">
			Plase :<input type="text" name="plase" value="${location.plase}">
			<input type="submit" value=" OK ">
			
		</form>
		
		
		
		<form action="updLocation.jsp">
			
			<h2>Update Location</h2>
			<h1>Change</h1>
			Country :<input type="text" name="country" value="${location.country}">
			City :<input type="text" name="city" value="${location.city}">
			Plase :<input type="text" name="plase" value="${location.plase}">
			<h1>To</h1>
			Country :<input type="text" name="country" value="${location2.country}">
			City :<input type="text" name="city" value="${location2.city}">
			Plase :<input type="text" name="plase" value="${location2.plase}">
			<input type="submit" value=" OK ">
			
		</form>
		
		
		
		<form action="delLocation.jsp">
			
			<h2>Remove Location</h2>
			Country :<input type="text" name="country" value="${location.country}">
			City :<input type="text" name="city" value="${location.city}">
			Plase :<input type="text" name="plase" value="${location.plase}">
			<input type="submit" value=" OK ">
		
		</form>
			
	</body>
</html>