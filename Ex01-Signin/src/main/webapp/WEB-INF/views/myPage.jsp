<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>최종선택</title>

	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <style type="text/css">
		.btn-set { width: 400px; margin: 100px auto; }
		.errMessage {color: red;}
		/* p{text-align: center;} */
    </style>
</head>
<body>

<div class="col-lg-8 mx-auto p-3 py-md-5">
	<header class="d-flex align-items-center pb-3 mb-5 border-bottom">
		<a href="/" class="d-flex align-items-center text-dark text-decoration-none">
			<svg xmlns="http://www.w3.org/2000/svg" width="40" height="32" class="me-2" viewBox="0 0 118 94" role="img">
				<title>Bootstrap</title>
				<path fill-rule="evenodd" clip-rule="evenodd" d="M24.509 0c-6.733 0-11.715 5.893-11.492 12.284.214 6.14-.064 14.092-2.066 20.577C8.943 39.365 5.547 43.485 0 44.014v5.972c5.547.529 8.943 4.649 10.951 11.153 2.002 6.485 2.28 14.437 2.066 20.577C12.794 88.106 17.776 94 24.51 94H93.5c6.733 0 11.714-5.893 11.491-12.284-.214-6.14.064-14.092 2.066-20.577 2.009-6.504 5.396-10.624 10.943-11.153v-5.972c-5.547-.529-8.934-4.649-10.943-11.153-2.002-6.484-2.28-14.437-2.066-20.577C105.214 5.894 100.233 0 93.5 0H24.508zM80 57.863C80 66.663 73.436 72 62.543 72H44a2 2 0 01-2-2V24a2 2 0 012-2h18.437c9.083 0 15.044 4.92 15.044 12.474 0 5.302-4.01 10.049-9.119 10.88v.277C75.317 46.394 80 51.21 80 57.863zM60.521 28.34H49.948v14.934h8.905c6.884 0 10.68-2.772 10.68-7.727 0-4.643-3.264-7.207-9.012-7.207zM49.948 49.2v16.458H60.91c7.167 0 10.964-2.876 10.964-8.281 0-5.406-3.903-8.178-11.425-8.178H49.948z" fill="currentColor"></path></svg>
			<span class="fs-4">코스 요리 선택이 끝났습니다</span>
		</a>
		</header>
	
		<main>
		<h1>{sessionScope.uName }님</h1>
		<p class="fs-5 col-md-8">입력하신 정보를 확인하세요<br>
			메일: {sessionScope.uEmail } 아이디: ${sessionScope.uId } 비밀번호: ${sessionScope.pwd }</p>
	
		<div class="mb-5">
			<a href="in" class="btn btn-primary btn-lg px-4">로그아웃</a>
		</div>
	
		<hr class="col-3 col-md-2 mb-5">
	
		<div class="row g-5">
			<div class="col-md-6">
				<h2>ENTREE</h2>
				<p>선택하신 전체 요리입니다</p>
				<ul class="icon-list ps-0">
					<li class="d-flex align-items-start mb-1">Pan seared calmari and smoked paprika sauce</li>
					<li class="text-muted d-flex align-items-start mb-1">대포오징어 필렛, 피망, 훈제 파프리카, 오이피클, 마늘, 허브</li>
				</ul>
			</div>
			<div class="col-md-6">
				<h2>PLAT</h2>
				<p>선택하신 메인 요리입니다</p>
				<ul class="icon-list ps-0">
					<li class="d-flex align-items-start mb-1">Magnet de Canard</li>
					<li class="text-muted d-flex align-items-start mb-1">오리가슴살, 구운 고구마, 레드와인 소스, 그릴드 새송이 버섯</li>
				</ul>
			</div>
			<div class="col-md-6">
				<h2>DESSERT</h2>
				<p>선택하신 디저트입니다</p>
				<ul class="icon-list ps-0">
					<li class="d-flex align-items-start mb-1">Strawberry and Raspberry Cream</li>
					<li class="text-muted d-flex align-items-start mb-1">딸리, 크럼블, 라즈베리 크림</li>
				</ul>
			</div>
	

		</div>

		</main>
		<footer class="pt-5 my-5 text-muted border-top">
		Created by the bom; &copy; 2022-08-05
		</footer>
	</div>
</body>
</html>