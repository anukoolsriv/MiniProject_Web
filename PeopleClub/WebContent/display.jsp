<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>

	<table border='1'>
			<tr>
				<th>Id</th>
				<th>FName</th>
				<th>LName</th>
				<th>DOB</th>
				<th>City</th>				
			</tr>
			<!-- For loop -->
			<c:forEach  var="i" items="${list}">
				<tr>
				<td>${i.id} </td>
				<td>${i.fName } </td>
				<td>${i.lName} </td>
				<td>${i.dateOfBirth} </td>
				<td>${i.city} </td>
					</tr>
			</c:forEach>
			<!-- End for loop -->
		</table>
</body>
</html>