<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인성공</title>

	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <style type="text/css">
		.btn-set { width: 400px; margin: 100px auto; }
		.errMessage {color: red;}
		p{text-align: center;}
    </style>
</head>
<body>

<div class="btn-set">

	<!-- 로그인 정보 -->
	<ul class="list-group list-group-horizontal">
	  <li class="list-group-item">회원 정보</li>
	  <li class="list-group-item">${sessionScope.uId}</li>
	  <li class="list-group-item">${sessionScope.pwd}</li>
	</ul>
	
	<!-- 선택한 상품정보 -->
	<ul class="list-group list-group-horizontal-xl">
	  <li class="list-group-item">An item</li>
	  <li class="list-group-item">A second item</li>
	  <li class="list-group-item">A third item</li>
	</ul>
	
	<!-- 버튼 -->
	<a href="in" class="w-100 btn btn-lg btn-primary">로그아웃</a><br><br>
	<a href="/" class="w-100 btn btn-lg btn-primary">첫화면으로</a><br>
</div>


</body>
</html>