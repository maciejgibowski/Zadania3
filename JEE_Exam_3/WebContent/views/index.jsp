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

<!--  W pliku index.jsp napisz link odnoszący się do servletu dostępnego -->
<!-- 	/receiver i przekazujący zmienne metodą GET. Przekazane zmienne są następujące: -->
<!--    name = "coder" -->
<!--    mail = "coder@somemail.com" -->
<!--    id = 34 -->

	<form action="../Receiver" method="get">
	<input type="hidden" name="name" value="coder"/>
	<input type="hidden" name="mail" value="coder@somemail.com"/>
	<input type="hidden" name="id" value="34"/>
	<input type="submit" name="receiver">
	</form>
	
	<a href='<c:url value="/views/form.jsp"/>'>Form</a><br>
	<a href='<c:url value="../Smurfs"/>'>Smurf</a><br>
	<a href='<c:url value="/views/homepage.jsp"/>'>Ciasteczka</a><br>
	<a href='<c:url value="../addquote"/>'>Zapisz cytat</a><br>
	<a href='<c:url value="../allquotes"/>'>Wyświetl wszystkie cytaty</a><br>
	<a href='<c:url value="../Randomquote"/>'>Wyświetl losowy cytat</a><br>
</body>
</html>