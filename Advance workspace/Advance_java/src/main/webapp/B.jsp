<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- JSP B -->
<%
  request.setAttribute("colddrink", "pepsi");
  %>
<%-- <%response.sendRedirect("c.jsp"); %> --%>
  <jsp:forward page = "c.jsp"/>

</body>
</html>