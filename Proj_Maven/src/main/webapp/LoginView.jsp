<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<body>


	<form action="LoginCtl" method="post">
		<%@include file="Header.jsp"%>

		<div align="center">
			<br></br> <br></br> <br></br> <br> <br>

			<h1>

				<%
					String log = (String) request.getAttribute("logout");
					if (log != null) {
				%>
				<font color="green"><%=log%></font>

				<%
					}
				%>
			</h1>
             
			<h1>

				<%
					String e = (String) request.getAttribute("err");
					if (e != null) {
				%>
				<font color="red"><%=e%></font>

				<%
					}
				%>
			</h1>
			<h1>
				<%
					String z = (String) request.getAttribute("p");
					if (z != null) {
				%>
				<font color="green"><%=z%></font>

				<%
					}
				%>
			</h1>
			<table>
				<tr>
					<th>Login :</th>
					<td><input type="text" name="login"></td>
					<td>
						<%
							String e1 = (String) request.getAttribute("i1");
							if (e1 != null) {
						%> <font color="red"><%=e1%></font> <%
 	}
 %>
					</td>
				</tr>

				<tr>
					<th>Password :</th>
					<td><input type="password" name="pwd"></td>
					<td>
						<%
							String e2 = (String) request.getAttribute("i2");
							if (e2 != null) {
						%> <font color="red"><%=e2%></font> <%
 	}
 %>
					</td>
				<tr>
					<th></th>
					<td><input type="submit" name="op" value="Sign In"></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="RegistrationView.jsp">Create account...??</a></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="ForgetPasswordView.jsp">Forgot Password? </a></td>
				</tr>
			</table>
		</div>
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br>
	</form>
	<%@include file="Footer.jsp"%>
</body>

</html>