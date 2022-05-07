<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
<%@include file="Header.jsp"  %>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<h1>
		<center>Welcome User</center>
	</h1>
	
	
	<%
		CandidateBean name = (CandidateBean) session.getAttribute("user");
		if (name != null) {
	%>
	<h1>
		<center>
			<font color="navy">Hello</font>
		</center>
	</h1>
	<h1>
		<center>
			<font color="navy"><%=name.getFirstName()%></font>
		</center>
	</h1>
	<%
		}
	%>
	<br><br><br><br><br><br><br><br><br><br><br><br>
	<%@include file="Footer.jsp"  %>
</body>
</html>