<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Students SQL Demo</title>
</head>
<body>

<h1>Java JSP MySql MVC Database Example</h1>

<h3>MySql Table Data</h3>
<p>The below data is in a sql database named Students, in a table named users
There is no java code in my jsp file. Rather I use jstl jar to enable special tags
to loop over data.
</p>

	<table style="width:100%" border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Major</th>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id}</td>
				<td><c:out value="${student.firstName}" /></td>
				<td><c:out value="${student.lastName}" /></td>
				<td><c:out value="${student.email}" /></td>
				<td><c:out value="${student.major}" /></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>