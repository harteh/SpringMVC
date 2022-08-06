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
    <title>코스요리선택</title>
    
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <style type="text/css">
		/* 기본 css */
		.bd-placeholder-img { font-size: 1.125rem;	text-anchor: middle;	-webkit-user-select: none; -moz-user-select: none;	user-select: none;	}
		@media (min-width: 768px) {	.bd-placeholder-img-lg { font-size: 3.5rem;	}	}
		.b-example-divider { height: 2rem;	background-color: rgb(134 183 254 / 10%); 
			/* border: solid rgba(0, 0, 0, .15);	border-width: 1px 0;
			box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);	 */
		}
		.b-example-vr {	flex-shrink: 0;	width: 1.5rem;	height: 100vh;	}
		.bi {	vertical-align: -.125em;	fill: currentColor;	}
		.nav-scroller {	position: relative;	z-index: 2;	height: 2.75rem;	overflow-y: hidden;	}
		.nav-scroller .nav { display: flex;	flex-wrap: nowrap;	padding-bottom: 1rem; margin-top: -1px;	
		overflow-x: auto;	text-align: center; white-space: nowrap;	-webkit-overflow-scrolling: touch;	}
	/* 요리선택 css */
		.list-group {  max-width: 460px;  margin: 4rem auto;}
		.form-check-input:checked + .form-checked-content {  opacity: .5;}
		.form-check-input-placeholder {  border-style: dashed;}
		[contenteditable]:focus {  outline: 0;}
		.list-group-checkable .list-group-item {  cursor: pointer;}
		.list-group-item-check {  position: absolute;  clip: rect(0, 0, 0, 0);}
		.list-group-item-check:hover + .list-group-item {  background-color: var(--bs-light);}
		.list-group-item-check:checked + .list-group-item {  color: #fff;  background-color: var(--bs-blue);}
		.list-group-item-check[disabled] + .list-group-item,
		.list-group-item-check:disabled + .list-group-item {  pointer-events: none;  filter: none;  opacity: .5;}
		.list-group-radio .list-group-item {  cursor: pointer;  border-radius: .5rem;}
		.list-group-radio .form-check-input {  z-index: 2;  margin-top: -.5em;}
		.list-group-radio .list-group-item:hover,
		.list-group-radio .list-group-item:focus {  background-color: var(--bs-light);}
		.list-group-radio .form-check-input:checked + .list-group-item {  background-color: var(--bs-body);  border-color: var(--bs-blue);  box-shadow: 0 0 0 2px var(--bs-blue);}
		.list-group-radio .form-check-input[disabled] + .list-group-item,
		.list-group-radio .form-check-input:disabled + .list-group-item {  pointer-events: none;  filter: none;  opacity: .5;}

		.btn-set { width: 500px; margin: 70px auto 30px; }
		.errMessage {color: red;}
		p{text-align: center;}
    </style>
</head>
<body>

<form:form action="secP" modelAttribute="foodData" method="post">
	<div class="btn-set">
		<h2 class="text-center fw-bold">${data.uId }님,</h2>
		<h2 class="text-center fw-bold">요리를 선택해 주세요</h2>

		<div class="list-group mx-0 w-auto">
			<label class="list-group-item d-flex gap-2">
				<form:radiobutton path="allergy" class="form-check-input flex-shrink-0" name="allergy" id="allergy1" value="있음" />
				<span>
					주의해야 할 알러지가 있습니다.
					<small class="d-block text-muted">서버에게 알러지 항목을 알려주세요</small>
				</span>
				</label>
			<label class="list-group-item d-flex gap-2">
				<form:radiobutton path="allergy" class="form-check-input flex-shrink-0" name="allergy" id="allergy2" value="없음" checked="checked" />
				<span>
					알러지가 없습니다.
					<small class="d-block text-muted">괜찮습니다</small>
				</span>
			</label>
		</div>
			<hr class="col-3 col-md-3 mb-5">
		</div>
	</div>

	<div class="container mt-5"><div class="row">
		
		<!-- 전체요리(앙뜨레) 코스요리 선택  -->
		<div class="list-group list-group-radio d-grid gap-2 border-0 w-auto  col">
			<p>ENTREE (전체요리)</p>
			<div class="position-relative">
				<form:radiobutton path="entree" class="form-check-input position-absolute top-50 end-0 me-3 fs-5"  
						name="entree" id="entree1" value="Pan seared calmari and smoked paprika sauce" checked="checked" />
				<label class="list-group-item py-3 pe-5" for="entree1">
					<strong class="fw-semibold">Pan seared calmari and smoked paprika sauce</strong>
					<span class="d-block small opacity-75">대포오징어 필렛, 피망, 훈제 파프리카, 오이피클, 마늘, 허브</span>
				</label>
			</div>

			<div class="position-relative">
				<form:radiobutton path="entree" class="form-check-input position-absolute top-50 end-0 me-3 fs-5"  
						name="entree" id="entree2" value="Fish gratin with salmon roe" />
				<label class="list-group-item py-3 pe-5" for="entree2">
					<strong class="fw-semibold">Fish gratin with salmon roe</strong>
					<span class="d-block small opacity-75">베샤멜소스, 대구살, 연어알, 크루통, 허브</span>
				</label>
			</div>

			<div class="position-relative">
				<form:radiobutton path="entree" class="form-check-input position-absolute top-50 end-0 me-3 fs-5" 
						name="entree" id="entree3" value="Poached egg & Grilled leek, Blue cheese" />
				<label class="list-group-item py-3 pe-5" for="entree3">
					<strong class="fw-semibold">Poached egg & Grilled leek, Blue cheese</strong>
					<span class="d-block small opacity-75">대파, 수란, 블루치즈, 베이컨, 허브 수제 마요네즈</span>
				</label>
			</div>
		</div>
		<!-- 메인요리(쁠라) 코스요리 선택  -->
		<div class="list-group list-group-radio d-grid gap-2 border-0 w-auto  col">
			<p>PLAT (메인요리)</p>
			<div class="position-relative">
				<form:radiobutton path="plat" class="form-check-input position-absolute top-50 end-0 me-3 fs-5" 
						name="plat" id="plat1" value="Magnet de Canard" checked="checked" />
				<label class="list-group-item py-3 pe-5" for="plat1">
					<strong class="fw-semibold">Magnet de Canard</strong>
					<span class="d-block small opacity-75">오리가슴살, 구운 고구마, 레드와인 소스, 그릴드 새송이 버섯</span>
				</label>
			</div>

			<div class="position-relative">
				<form:radiobutton path="plat" class="form-check-input position-absolute top-50 end-0 me-3 fs-5" 
						name="plat" id="plat2" value="Today's fish" />
				<label class="list-group-item py-3 pe-5" for="plat2">
					<strong class="fw-semibold">Today's fish</strong>
					<span class="d-block small opacity-75">신선한 제철 생선요리, 서버에게 문의해 주세요</span>
				</label>
			</div>

			<div class="position-relative">
				<form:radiobutton path="plat" class="form-check-input position-absolute top-50 end-0 me-3 fs-5" 
						name="plat" id="plat3" value="Cotes d'agneau" />
				<label class="list-group-item py-3 pe-5" for="plat3">
					<strong class="fw-semibold">Cotes d'agneau</strong>
					<span class="d-block small opacity-75">어린 양갈비, 감자무슬린, 구운 아채, 레드와인 소스, 쏘렐</span>
				</label>
			</div>
		</div>
		<!-- 디저트 코스요리 선택  -->
		<div class="list-group list-group-radio d-grid gap-2 border-0 w-auto  col">
			<p>DESSERT</p>
			<div class="position-relative">
				<form:radiobutton path="dessert" class="form-check-input position-absolute top-50 end-0 me-3 fs-5" 
						name="dessert" id="dessert1" value="Chocolate Cake with Lime Cream (Gluten free)" checked="checked" />
				<label class="list-group-item py-3 pe-5" for="dessert1">
					<strong class="fw-semibold">Chocolate Cake with Lime Cream (Gluten free)</strong>
					<span class="d-block small opacity-75">초콜릿 케이크(밀가루를 넣지 않은), 라임크림</span>
				</label>
			</div>

			<div class="position-relative">
				<form:radiobutton path="dessert" class="form-check-input position-absolute top-50 end-0 me-3 fs-5" 
						name="dessert" id="dessert2" value="Strawberry and Raspberry Cream" />
				<label class="list-group-item py-3 pe-5" for="dessert2">
					<strong class="fw-semibold">Strawberry and Raspberry Cream</strong>
					<span class="d-block small opacity-75">딸리, 크럼블, 라즈베리 크림</span>
				</label>
			</div>
		</div>

		</div>
	</div>

	<div class="container w-50 h-100 mb-5 mt-5"><div class="row">
	<!-- 이동 버튼 세트 -->
		<a href="login" class="w-100 h-50 btn btn-lg btn-outline-secondary col me-3">로그아웃</a>
		<a href="/" class="w-100 h-50 btn btn-lg btn-outline-secondary col me-3">처음으로</a>
		<form:button type="submit" class="w-100 h-50 btn btn-lg btn-warning col me-3 ">선택완료</form:button>
	</div></div>

</form:form>

</body>
</html>