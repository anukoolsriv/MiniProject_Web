<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Front.do">
		<table border=1>
			<tr>
				<td>Enter First Name</td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>Select date</td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enter" /></td>
			</tr>
		</table>
	</form>
</body>
</html>