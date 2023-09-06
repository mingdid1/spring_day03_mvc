<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	get_post/index.jsp
	<hr>
	method 지정시 지정한 메소드의 값만 받아올수있다
	
	<h3>get 방식</h3>
	<form action="result" method="get"><br>
		<input type="text" name="name"><br>
		<input type="text" name="age">
		<input type="submit" value="get전송">
	</form>

	<h3>post 방식</h3>
	<form action="result" method="post"><br>
		<input type="text" name="name"><br>
		<input type="text" name="age">
		<input type="submit" value="post전송">
	</form>

	<h3>dto 방식</h3>
	이름이 같은 변수만 저장시킨다
	<form action="dto" method="post"><br>
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="text" name="addr">
		<input type="submit" value="dto전송">
	</form>
	
	
</body>
</html>