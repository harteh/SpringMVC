# SpringMVC
로그인 기능과 코스요리 선택 구현  
세션을 이용한 데이터 유지 구현  

[구현 화면]
<img src="~@source/Ex01-Signin/image/select_course.gif" width="70%"	/>



## Bean
로그인한 회원의 정보를 담을 Data와 코스요리 정보를 담을 FoodData로 구성한다  

+ 로그인 시 받을 회원 정보는 유효성 검사를 통해서 각 조건을 검증한다  
	- 아이디는 필수입력 사항이며 3자이상 10자 이하의 길이를 가진다  
	- 비밀번호는 영어 소문자, 대문자와 숫자만 사용 가능하며, 5자이상 10자 이하여야 한다  
	- 이름은 필수입력 사항이다
	- 이메일은 메일형식에 맞게 입력해야한다



## Contoller
Spring의 @Controller를 이용하여 크라이언트의 요청을 처리한다

@GetMapping(), @PostMapping을 통해서 url을 매핑하고 비지니스 로직을 구현한다 












