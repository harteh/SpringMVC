<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인-로그인 폼</title>
    
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="/ex01Signin.css" />
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    
</head>
<body class="text-center mt-5">

${sessionScope.uId}
<main class="form-signin w-50 m-auto ">
	<!-- <div class="btn-set"> -->
		<!-- 로고 사진 -->
		<img class="mb-4 mt-5" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR18EnnuLn8XDU7d0-Xrpn_Rz6vd51hf0MBQNftF2HaZowmRxRrB9H5OVuDl6i8mkEw__Y&usqp=CAU" 
			alt="" width="222" height="227">

		<a href="in" class="w-100 btn btn-lg btn-warning">로그인</a><br><br>
	<!-- </div> -->
</main>
</body>
</html>