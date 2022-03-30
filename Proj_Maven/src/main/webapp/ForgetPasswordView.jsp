<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot password</title>
</head>
<body>
	<form action="forget" method="post">
		<div align="center">
			<h1>Forget Password . . . ? ? ?</h1>
		</div>
		<h1>

			<%
				String m2 = (String) request.getAttribute("t3");
				if (m2 != null) {
			%>
			<font color="red"><%=m2%></font>

			<%
				}
			%>
		</h1>
		<table align="center">
			<tr>
				<td>Login :</td>
				<td><input type="text" name="login"></td>
				<td>
					<%
						String m1 = (String) request.getAttribute("t1");
						if (m1 != null) {
					%> <font color="red"><%=m1%></font> <%
 	}
 %>
				</td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><input type="submit" name="Submit" value="Click Here..."></td>
			</tr>


		</table>
		</div>
	</form>
</body>
</html>