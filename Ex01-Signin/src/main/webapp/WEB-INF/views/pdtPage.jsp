<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품-로그인성공</title>
    
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
	<p>${data.uId }님이 로그인 되었습니다</p><br><br><br>
	
	<p>상품을 선택하세요</p>
	<div class="form-check">
	  <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
	  <label class="form-check-label" for="flexCheckDefault">
	    Default checkbox
	  </label>
	</div>
	<div class="form-check">
	  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
	  <label class="form-check-label" for="flexCheckChecked">
	    Checked checkbox
	  </label>
	</div>
	<br>	<br>	<br>

	<a href="login" class="w-100 btn btn-lg btn-primary">로그아웃</a><br><br>
	<!-- 	<a href="myPage" class="w-100 btn btn-lg btn-primary">비밀번호찾기</a><br><br>	-->
	<a href="secP" class="w-100 btn btn-lg btn-primary">비밀번호찾기</a><br> <br>
	<a href="/" class="w-100 btn btn-lg btn-primary">첫화면으로</a><br>
</div>


</body>
</html>