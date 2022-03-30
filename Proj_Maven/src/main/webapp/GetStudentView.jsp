<%@page import="in.co.rays.bean.StudentBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Student Details</title>
</head>
<body>
	<form action="GetStdCtl" method="post">
		
		<table align="center">
		
			<tr>
				<th>Roll no:</th>
				<td><input type="text" name="rollno"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="Submit" name="operation" value="get"></td>
			</tr>
		</table>


	</form>
</body>
</html>