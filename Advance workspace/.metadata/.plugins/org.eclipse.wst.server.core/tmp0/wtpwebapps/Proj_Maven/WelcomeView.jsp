<%@ page errorPage="ErrorPage.jsp" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="">
		<%@include file="Header.jsp"%>

		<br> <br> <br> <br> <font color="green"><h1>Welcome
				User....!!!</h1></font>

		<%
			UserBean user1 = (UserBean) session.getAttribute("user");
		%>

		<h1>
			Hii...
			<%=user1.getName()%></h1>


		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br>
	</form>
	<%@include file="Footer.jsp"%>
</body>
</html>