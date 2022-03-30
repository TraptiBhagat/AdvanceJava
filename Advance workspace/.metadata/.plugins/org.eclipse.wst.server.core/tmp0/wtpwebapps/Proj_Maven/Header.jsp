<%@page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
* {
	box-sizing: border-box;
}

.header {
	Display: flex;
	background-color: #f1f1f1;
	padding: 10px 10px;
	justify-content: space-between;
}

.header Account {
	align-content: center;
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
	color: black;
}

.header a {
	align-content: center;
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 20px;
	line-height: 25px;
	border-radius: 4px;
	color: black;
}

.header a:hover {
	background-color: #ddd;
	color: black;
}
</style>
<title>Header page</title>
</head>
<body>



	<div class="header">

		<%
			UserBean user = (UserBean) session.getAttribute("user");
			if (user != null) {
		%>

		<div class="Account">
			Hi,<%=user.getName()%>
		</div>
		<div class="header">

			<a href="">Home |</a> <a href="">Sign Up |</a> <a href="">About |</a>
			<a href="Logout.jsp">Logout |</a><a href="marksheet">Marksheet |</a><a
				href="StudentView.jsp">Student |</a><a
				href="VisitorCount">Visitor Count</a>
		</div>

		<%
			} else {
		%>
		<h3>Hii, Guest</h3>
		<%
			}
		%>


	</div>


</body>
</html>