<%@page import="java.util.Iterator"%>
<%@page import="in.co.rays.bean.CandidateBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Candidate List</title>
</head>
<body>
	<form action="" method="get">
		<jsp:useBean id="bean" class="in.co.rays.bean.CandidateBean"
			scope="request"></jsp:useBean>
		<%
			List<CandidateBean> list = (List<CandidateBean>) request.getAttribute("List");
			Iterator<CandidateBean> it = list.iterator();
		%>
		<table border="1" style="width: 100%; border: groove;">
			<tr style="background-color: #e1e6f1e3;">

				<th style="width: 5%;">ID</th>
				<th style="width: 15%;">ROLL_NO</th>
				<th style="width: 15%;">FIRST_NAME</th>
				<th style="width: 15%;">LAST_NAME</th>
			</tr>
			<%
				while (it.hasNext()) {
					bean = it.next();
			%>
			<tr>

				<td style="text-align: center; text-transform: capitalize;"><%=bean.getId()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getRollno()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getFirstName()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getLastName()%></td>


				<%
					}
				%>
			
	</form>
</body>
</html>