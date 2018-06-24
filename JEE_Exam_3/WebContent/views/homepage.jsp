<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty cookie.agree}">
		<p>Informujemy, że ta strona korzysta z plików cookies.</p>
		<a href="http://localhost:8080/JEE_Exam_3/homepage">akceptuj</a>
	</c:if>
	<c:if test="${not empty cookie.agree}">
		<p>Ciasteczka zaakceptowane.</p>
	</c:if>

</body>
</html>