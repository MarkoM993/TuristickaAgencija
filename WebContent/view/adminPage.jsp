<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adminova strana</title>
	<link rel="stylesheet" 
	type="text/css" 
	href="../css/style.css" />
</head>
<body>
	<div id="plavaCrta">
	LOGO
	</div>
	
	<%
	//	User user = (User) session.getAttribute("user");
	%>
	
	<jsp:useBean id="user" scope="session" class="model.User"></jsp:useBean>

	<h1>Hellooo ${user.userName}</h1>

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
	
	<table border="1">
		<tr>
			<th>BROJ</th>
			<th>NESTO</th>
		</tr>
		
		
		<c:forEach begin="0" end="${zbir}" var="i" >
			<tr>
				<td>"${i}"</td>
				<td>${zbir-i}</td>
			</tr>
			</c:forEach>
		
	</table>
	
	<div >
	<a href = "../SviUseriServlet"> 
		<img src="../slike/globus3.jpg">
	</a>
	</div>
	<br>
	<br>
	<br>
	<div>
	<a href = "dodajDestinaciju.jsp"> 
		<button >DODAJ DESTINACIJU</button>
	</a>
	
	<a href = "../ListaDestinacijaServlet"> 
		<button >DODAJ TRANSPORT</button>
	</a>
	</div>
	
	
	
	


</body>
</html>