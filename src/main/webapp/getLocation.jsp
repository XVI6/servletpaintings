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
		
		<form action="addLocation.jsp">
			Country :<input type="text" name="country" value="${location.country}">
			City :<input type="text" name="city" value="${location.city}">
			Plase :<input type="text" name="plase" value="${location.plase}">
			<input type="submit" value=" OK ">
			
		
		</form>
			
	</body>
</html>