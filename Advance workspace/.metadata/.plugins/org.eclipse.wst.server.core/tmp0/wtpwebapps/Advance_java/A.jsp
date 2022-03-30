<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <!-- JSP A -->
  <%
  request.setAttribute("mithai", "Kajukatli");
  %>
  <%-- <% response.sendRedirect("B.jsp"); %> --%>
  <jsp:forward page = "B.jsp"/> 
</body>
</html>