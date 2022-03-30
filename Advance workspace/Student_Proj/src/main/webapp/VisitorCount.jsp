<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visitor count</title>
</head>
<body>
	<form action="VisitorCount" method="get">
		<%
			String vCount = (String) request.getAttribute("visitCount");
			if (vCount != null) {
		%>
		<h1><%=vCount%></h1>
		
		<%
			}
		%>

	</form>
</body>
</html>