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
    <link rel="stylesheet" href="/ex01Signin.css" />
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    
</head>
<body>

<div class="col-lg-8 mx-auto p-3 py-md-5">
	<header class="d-flex align-items-center pb-3 mb-5 border-bottom">
		<a href="/" class="d-flex align-items-center text-dark text-decoration-none">
			<svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" fill="currentColor" class="bi bi-basket mx-4" viewBox="0 0 16 16">
			  <path d="M5.757 1.071a.5.5 0 0 1 .172.686L3.383 6h9.234L10.07 1.757a.5.5 0 1 1 .858-.514L13.783 6H15a1 1 0 0 1 1 1v1a1 1 0 0 1-1 1v4.5a2.5 2.5 0 0 1-2.5 2.5h-9A2.5 2.5 0 0 1 1 13.5V9a1 1 0 0 1-1-1V7a1 1 0 0 1 1-1h1.217L5.07 1.243a.5.5 0 0 1 .686-.172zM2 9v4.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V9H2zM1 7v1h14V7H1zm3 3a.5.5 0 0 1 .5.5v3a.5.5 0 0 1-1 0v-3A.5.5 0 0 1 4 10zm2 0a.5.5 0 0 1 .5.5v3a.5.5 0 0 1-1 0v-3A.5.5 0 0 1 6 10zm2 0a.5.5 0 0 1 .5.5v3a.5.5 0 0 1-1 0v-3A.5.5 0 0 1 8 10zm2 0a.5.5 0 0 1 .5.5v3a.5.5 0 0 1-1 0v-3a.5.5 0 0 1 .5-.5zm2 0a.5.5 0 0 1 .5.5v3a.5.5 0 0 1-1 0v-3a.5.5 0 0 1 .5-.5z"/>
			</svg>		
			<span class="fs-4">코스 요리 선택이 끝났습니다</span>
		</a>
		</header>
	
		<main>
		<h1>${sessionScope.uName }님</h1>
		<p class="fs-5 col-md-8">입력하신 정보를 확인하세요<br>
			메일: ${sessionScope.uEmail } 아이디: ${sessionScope.uId } 비밀번호: ${sessionScope.pwd }<br>
			<span class="errMessage">알러지: ${sessionScope.allergy }</span>
		</p>
	
		<div class="mb-5">
			<a href="in" class="btn btn-warning btn-lg px-4">로그아웃</a>
		</div>
	
		<hr class="col-3 col-md-2 mb-5">
	
		<div class="row g-5">
			<div class="col-md-6">
				<h2>${sessionScope.entree }</h2>
				<ul class="icon-list ps-0">
					<li class="d-flex align-items-start mb-1">ENTREE</li>
					<li class="text-muted d-flex align-items-start mb-1">선택하신 전체 요리입니다</li>
				</ul>
			</div>
			<div class="col-md-6">
				<h2>${sessionScope.plat }</h2>
				<ul class="icon-list ps-0">
					<li class="d-flex align-items-start mb-1">PLAT</li>
					<li class="text-muted d-flex align-items-start mb-1">선택하신 메인 요리입니다</li>
				</ul>
			</div>
			<div class="col-md-6">
				<h2>${sessionScope.dessert }</h2>
				<ul class="icon-list ps-0">
					<li class="d-flex align-items-start mb-1">DESSERT</li>
					<li class="text-muted d-flex align-items-start mb-1">선택하신 디저트입니다</li>
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