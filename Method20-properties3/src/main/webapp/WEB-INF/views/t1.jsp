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

<!-- 
t1<br>
<spring:message code="aaa.a1"/><br>
<spring:message code="bbb.b1"/><br>
<spring:message code="aaa.a2" arguments="${a }"/><br>
 -->
 
 <form action="po" method="post">
 	d1:<input type="text" name="d1"><br>
 	<spring:hasBindErrors name="data1">
 		<c:if test="${errors.hasFieldErrors('d1') }">
 			${errors.getFieldError('d1').defaultMessage} <br>
 		</c:if>
 	</spring:hasBindErrors>
 	
 	d2:<input type="text" name="d2"><br>
 	<spring:hasBindErrors name="data2">
 		<c:if test="${errors.hasFieldErrors('d2') }">
 			${errors.getFieldError('d2').defaultMessage} <br>
 		</c:if>
 	</spring:hasBindErrors>
 	
 	<button type="submit">확인</button>
 	
 </form>

</body>
</html>