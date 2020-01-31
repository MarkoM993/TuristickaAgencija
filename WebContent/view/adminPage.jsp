<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adminova strana</title>
<link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>
<body>
	<div id="plavaCrta">LOGO</div>
	<%
		User user = (User) session.getAttribute("userIzBaze");
	%>

	<h1>
		Hellooo
		<%=user.getUserName()%></h1>

	<%
		int x = 1;
		int y = 2;
		int zbir = x + y;
	%>

	<p>
		Moj omiljeni zbir brojeva je:
		<%=zbir%>
	</p>

	<%
		for (int i = 0; i <= y; i++) {
	%>

	<p>
		Broj:
		<%=i%>
	</p>

	<%
		}
	%>


</body>
</html>