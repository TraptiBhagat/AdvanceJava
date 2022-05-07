<%@page import="in.co.rays.bean.CandidateBean"%>
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
<title>Header Page</title>
</head>
<body>
	<div class="header">
		<%
			CandidateBean user = (CandidateBean) session.getAttribute("user");
			if (user != null) {
		%>

		<div class="Account">
			Hello <%=user.getFirstName()%>
		</div>
		<div>
			<a href="GetCandidateList.jsp">Get Candidate Details</a> <a href="CandidateListCtl.do">Candidate List</a> <a
				href="LogoutCtl">Logout</a>

		</div>
		<%
			} else {
		%>
		<h3>Hello Guest</h3>
		<%
			}
		%>
	</div>
	<hr>
</body>
</html>