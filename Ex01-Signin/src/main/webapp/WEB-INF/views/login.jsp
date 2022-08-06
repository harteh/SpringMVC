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
    <title>로그인 폼</title>
    
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <style type="text/css">
      .bd-placeholder-img { font-size: 1.125rem;	text-anchor: middle;	-webkit-user-select: none; -moz-user-select: none;	user-select: none;	}
      @media (min-width: 768px) {	.bd-placeholder-img-lg { font-size: 3.5rem;	}	}
      .b-example-divider { height: 3rem;	background-color: rgba(0, 0, 0, .1); border: solid rgba(0, 0, 0, .15);	border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);	}
      .b-example-vr {	flex-shrink: 0;	width: 1.5rem;	height: 100vh;	}
      .bi {	vertical-align: -.125em;	fill: currentColor;	}
      .nav-scroller {	position: relative;	z-index: 2;	height: 2.75rem;	overflow-y: hidden;	}
      .nav-scroller .nav { display: flex;	flex-wrap: nowrap;	padding-bottom: 1rem; margin-top: -1px;	
        overflow-x: auto;	text-align: center; white-space: nowrap;	-webkit-overflow-scrolling: touch;	}
      
      .errMessage {color: red;}
    </style>
</head>
<body class="text-center" id="loginForm">
        
<main class="form-signin w-50 mt-5 m-auto" >
      <form:form action="pro" modelAttribute="data" method="post">
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
    
		<!-- 아이디 -->
        <div class="form-floating">
          <form:input path="uId" type="text" class="form-control" id="floatingInput" placeholder="ID" />
          <label for="floatingInput">아이디</label>
          <form:errors path="uId" class="errMessage" /><br>
        </div>
		<!-- 비밀번호 -->
        <div class="form-floating">
          <form:input path="pwd" type="password" class="form-control" id="floatingPassword" placeholder="Password" />
          <label for="floatingPassword">비밀번호</label>
          <form:errors path="pwd" class="errMessage"/><br>
        </div>
		<!-- 이름 -->
        <div class="form-floating">
          <form:input path="uName" type="text" class="form-control" id="floatingPassword" placeholder="Name" />
          <label for="floatingPassword">성함</label>
          <form:errors path="uName" class="errMessage"/><br>
        </div>
		<!-- 메일 -->
        <div class="form-floating">
          <form:input path="uEmail" type="email" class="form-control" id="floatingPassword" placeholder="Email" />
          <label for="floatingPassword">이메일</label>
          <form:errors path="uEmail" class="errMessage"/><br>
        </div>
    
        <form:button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</form:button>
        <p class="mt-5 mb-3 text-muted">&copy; 2022-08-05</p>
      </form:form>
    </main>    
</body>
</html>