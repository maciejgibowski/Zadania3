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

<!-- W pliku form.jsp napisz formularz zawierający te same pola oraz kierujący do tego samego servletu
 /receiver i przekazujący zmienne metodą GET. -->

<form action="../Receiver" method="GET">
       <label>Name:<input name="name" type="text"></label> 
       <label>Mail:<input name="mail" type="text"></label> 
       <label>Id:<input name="id" type="number"></label>
	   <input type="submit" name="send" value="Wyślij">
</form>
</body>
</html>