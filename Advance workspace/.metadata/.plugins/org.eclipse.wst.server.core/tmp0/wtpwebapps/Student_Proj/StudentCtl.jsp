<%@page import="in.co.rays.model.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Controller</title>
</head>
<body>
	<%@page import="in.co.rays.bean.StudentBean"%>

	<%
		StudentBean std = new StudentBean();
		std.setRollNo(request.getParameter("rollNo"));
		std.setFirstName(request.getParameter("firstName"));
		std.setLastName(request.getParameter("lastName"));
		std.setSession(request.getParameter("session"));

		String op = request.getParameter("operation");
		StudentModel sm = new StudentModel();
		if (op.equals("Add")) {
			sm.add(std);
		} else if (op.equals("Modify")) {
			sm.update(std);
		} else if (op.equals("Delete")) {
			sm.delete(std);
		}
	%>
	<jsp:forward page=""></jsp:forward>

</body>
</html>