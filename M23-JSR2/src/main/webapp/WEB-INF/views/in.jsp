<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>JSR2-In</title>
</head>
<body>

<form:form action="po" modelAttribute="data" method="post">
	d1: <form:input path="d1" type="text"/><br>
		<form:errors path="d1" /><br><br>
		
	d2: <form:input path="d2" type="text"/><br>
		<form:errors path="d2" /><br><br>
		
	d3: <form:input path="d3" type="text"/><br>
		<form:errors path="d3" /><br><br>
			
	d4: <form:input path="d4" type="text"/><br>
		<form:errors path="d4" /><br><br>
		
	d5: <form:input path="d5" type="text"/><br>
		<form:errors path="d5" /><br><br>
		
	d6: <form:input path="d6" type="text"/><br>
		<form:errors path="d6" /><br><br>
		
	d7: <form:input path="d7" type="text"/><br>
		<form:errors path="d7" /><br><br>
		
	<form:button type="submit">제출</form:button>
</form:form>

</body>
</html>