<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add Location</title>
</head>
<body>
	<jsp:useBean id="location" class="servlet.paintings.domain.Location" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="location"/>
	<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
	
	<% storage.addLocation(location); %>
	
	<p>Following person has been added to storage: </p>
		<p>Country: <jsp:getProperty name="location" property="country"/> </p>
		<p>City: <jsp:getProperty name="location" property="city"></jsp:getProperty></p>
		<p>Plase: <jsp:getProperty name="location" property="plase"></jsp:getProperty></p>
		<p>
		  <a href="showAll.jsp">Show all</a>
		</p>
		
	
</body>
</html>