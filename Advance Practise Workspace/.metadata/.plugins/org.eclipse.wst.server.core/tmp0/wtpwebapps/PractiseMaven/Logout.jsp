<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout Page</title>
</head>
<body>
   <% 
   session.invalidate();
   RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
   request.setAttribute("logout", "Logout successful");
   rd.forward(request, response);
   %>
</body>
</html>