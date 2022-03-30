<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up page</title>
</head>
<body>
	<form action="register" method="post">
		<h2 align="center">Registration Form</h2>


		<table align="center">

			<tr>
				<th>Name*</th>
				<td><input type="text" name="name"></td>
				<td>
					<%
						String err1 = (String) request.getAttribute("p1");
						if (err1 != null) {
					%> <font color="red"><%=err1%></font> <%
 	}
 %>
				</td>
			</tr>
			<tr>
				<th>Login*</th>
				<td><input type="text" name="login"></td>
				<td>
					<%
						String err2 = (String) request.getAttribute("p2");
						if (err2 != null) {
					%> <font color="red"><%=err2%></font> <%
 	}
 %>
				</td>
			</tr>
			<tr>
				<th>Password*</th>
				<td><input type="password" name="password"></td>
				<td>
					<%
						String err3 = (String) request.getAttribute("p3");
						if (err3 != null) {
					%> <font color="red"><%=err3%></font> <%
 	}
 %>
				</td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Submit" name="submit"></td>
			</tr>
		</table>

	</form>

</body>
</html>