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
<div>
<form method="get" action="">
<a href="insert.jsp">Insert a Record</a>
<a href="display.do">Display all Records</a>
<a href="delete.jsp">Delete a Record</a>
</form>
 <c:out value="${deleted} "></c:out>

</div>
</body>
</html>