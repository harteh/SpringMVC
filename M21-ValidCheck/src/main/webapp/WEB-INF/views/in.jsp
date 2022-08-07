<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>In</title>
</head>
<body>

<form:form action="po" modelAttribute="data" method="post">
	d1: <form:input path="d1" type="text"/><br>
		<form:errors path="d1" /><br><br>
		
	d2: <form:input path="d2" type="text"/><br>
		<form:errors path="d2" /><br><br>
		
	<form:button type="submit">제출</form:button>
</form:form>

</body>
</html>