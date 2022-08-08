<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>output</title>
    <!-- <link rel="stylesheet" href="/ex01Signin.css" /> -->
</head>
<body>

<h1> output</h1>
	<c:forEach var="obj" items="${li }">
		${obj.d1 }, ${obj.d2 }, ${obj.d3 } <br>  
	</c:forEach>


</body>
</html>