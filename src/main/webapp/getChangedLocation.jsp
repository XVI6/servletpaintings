<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="location" class="servlet.paintings.domain.Location" scope="session"></jsp:useBean>
		<jsp:setProperty property="*" name="location"/>
		<jsp:useBean id="storage" class="servlet.paintings.service.StorageService" scope="application"></jsp:useBean>
	
	<form action="updLocation.jsp">
		<% storage.deleteLocation(location); %>
		
		<h2>Update Location</h2>
		<h5>To:</h5>
		Name : <input type="text" name="name" value="${location.name}" >
		Year of birth :<input type="text"  name="yob" value="${location.yob}" >
		Year of death :<input type="text"  name="yod" value="${location.yod}" >
			<input type="submit" value=" OK ">
	</form>
		
	</body>
</html>