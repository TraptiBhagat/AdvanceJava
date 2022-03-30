<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style type="text/css">
body {
	
}
</style>
</head>
<body bgcolor="powderblue">
	<form action="Loginctl" method="post">
		<h2 align="center">Registration Form</h2>


		<table align="center">
			<tr>
				<th>User ID*</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>FirstName*</th>
				<td><input type="text" name="firstname"></td>
			</tr>
			<tr>
				<th>LastName*</th>
				<td><input type="text" name="lastname"></td>

			</tr>
			<tr>
				<th>Phone Number*</th>
				<td><input type="phone" name="phone"></td>
			</tr>
			<tr>
				<th>Email*</th>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<th>Password*</th>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" name="submit">
					<input type="submit" value="Reset" name="reset"></td>
			</tr>
		</table>

	</form>

</body>
</html>