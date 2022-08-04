<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

t1<br>
<spring:message code="aaa.a1"/><br>
<spring:message code="bbb.b1"/><br>
<spring:message code="aaa.a2" arguments="${a }"/><br>
 

</body>
</html>