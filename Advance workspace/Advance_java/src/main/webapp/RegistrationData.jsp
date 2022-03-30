<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String fn = request.getParameter("firstname");
	String ln = request.getParameter("lastname");
	String p = request.getParameter("phone");
	String e = request.getParameter("email");
	String ps = request.getParameter("password");
	String ge = request.getParameter("gender");
	String da = request.getParameter("date");
	String ho = request.getParameter("hobbies");
	String ad = request.getParameter("address");
	
	%>

	<%=fn%>
	<%=ln%>
	<%=p%>
	<%=e%>
	<%=ps%>
	<%=ge%>
	<%=da%>
	<%=ho%>
	<%=ad%>
	
	
</body>
</html>