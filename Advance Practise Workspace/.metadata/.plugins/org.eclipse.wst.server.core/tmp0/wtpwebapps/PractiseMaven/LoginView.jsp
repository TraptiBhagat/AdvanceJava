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
	<%@include file="Header.jsp"  %>
	<br><br><br><br><br>
		<table align="center">
		
		<%
				String logout = (String) request.getAttribute("logout");
				if (logout != null) {
			%>
			<h2>
				<center><font color="Green"><%=logout%></font></center>
			</h2>
			<%
				}
			%>

		
			<%
				String err = (String) request.getAttribute("error");
				if (err != null) {
			%>
			<h3>
				<center><font color="red"><%=err%></font></center>
			</h3>
			<%
				}
			%>



			<tr>
				<th>First Name:</th>
				<td><input type="text" name="firstname"></td>
				<td>
					<%
						String cr1 = (String) request.getAttribute("CredReq1");
						if (cr1 != null) {
					%>
					
						<font color="red"><%=cr1%></font>
					 <%
 	}
 %> 
				</td>
			</tr>
			<tr>
				<th>Last Name:</th>
				<td><input type="text" name="lastname"></td>
				<td>
					<%
						String cr2 = (String) request.getAttribute("CredReq2");
						if (cr2 != null) {
					%>
					
						<font color="red"><%=cr2%></font>
					 <%
 	}
 %> 
				</td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" name="submit" value="submit"></td>
			</tr>
		</table>

	</form>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<%@include file="Footer.jsp" %>
</body>
</html>