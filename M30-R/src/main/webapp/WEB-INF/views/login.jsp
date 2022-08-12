<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <!-- <link rel="stylesheet" href="/ex01Signin.css" /> -->
</head>
<body>

<h1>로그인 되었다 - requestScope</h1>
login ${requestScope.id} <br>
login ${requestScope.pw} <br>

<h1>로그인 되었다 - param</h1>
login ${param.id} <br>
login ${param.pw} <br>

<h1>로그인 되었다 - Model</h1>
login ${id} <br>
login ${pw} <br>
<hr>



<hr>
<h3><a href="/">메인으로</a> </h3>

</body>
</html>