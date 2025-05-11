<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalTime" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome ${ username }</title>
</head>
<body>
	
	<% 
		LocalDate date = LocalDate.now();
	 	LocalTime time = LocalTime.now();
	%>

	<h3>Welcome ${ username }</h3>
	<h2>Current Date: <%=date %> </h2>
	<h2>Current Time: <%= time %></h2>
</body>
</html>