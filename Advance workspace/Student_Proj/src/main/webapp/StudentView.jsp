<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form action="student" method="post">
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br>

		<%
			String add = (String) request.getAttribute("add");
			if (add != null) {
		%>
		<h1>
			<center>
				<font color="green"><%=add%></font>
			</center>
		</h1>
		<%
			}
		%>
		<table align="center">
			<tr>
				<th>RollNo:</th>
				<td><input type="text" name="rollNo"></td>
			</tr>
			<tr>
				<th>FirstName:</th>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<th>LastName:</th>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<th>Session:</th>
				<td><input type="text" name="session"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Add" name="operation">
					<input type="submit" value="Delete" name="operation"> <input
					type="submit" value="Modify" name="operation"></td>
			</tr>
			<tr>
				<th></th>
				<td>
					<center>
						<a href="GetStudentView.jsp">Get Student Details</a>
					</center>
				</td>
			</tr>
			<tr>
				<th></th>
				<td>
					<center>
						<a href="StdList">Get Student List</a>
					</center>
				</td>
			</tr>

		</table>

	</form>
</body>
</html>