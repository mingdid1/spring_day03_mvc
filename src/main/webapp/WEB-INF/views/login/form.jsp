<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript"
		src="/root/resources/js/test.js">
</script>
<link href="/root/css/test.css" rel="stylesheet"/>

<!-- 
	/root 대신 가변적인 위치 경로 사용
	<link href="${contextPath }/css/test.css" /> => jstl 사용
	<link href = "${pageContext.request.contextPath}/css/test.css" />
 -->

</head>
<body>
	login/form.jsp
	<hr>

	contextPath : ${contextPath }	

	<h3>로그인 페이지</h3>
	<button type="button" id="btn">클릭</button>
	<button type="button" onclick="test()">test 클릭</button>
	
	<form action="login_chk" method="post">
		<input type="text" name="id"><br>
		<input type="text" name="pwd">
		<input type="submit" value="로그인">
	</form>
</body>
</html>