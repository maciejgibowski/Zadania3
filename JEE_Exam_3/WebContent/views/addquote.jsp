<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj cytat</title>
</head>
<body>
	<form action="http://localhost:8080/JEE_Exam_3/addquote" method="post">
		<label>Autor <input type = "text" name = "author"/></label>
		 <label>Cytat <input type = "text" name = "quote"/></label><br>
		 <input type="submit" name="send" value="Send">
	</form>
</body>