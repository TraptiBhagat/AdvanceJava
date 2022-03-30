<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- JSP C -->
<%
  request.setAttribute("choclate", "kitkat");
 
  String s = (String) request.getAttribute("mithai");
  String m = (String) request.getAttribute("colddrink");
  String c = (String) request.getAttribute("choclate");
  %>
  
  <%=s %>
  <%=m %>
  <%=c %>
  
</body>
</html>