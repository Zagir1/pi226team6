<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор поиска периметра равнобедренного треугольника</title>
</head>
<body>
<h1>Калькулятор поиска периметра равнобедренного треугольника</h1>
	<form action="${pageContext.request.contextPath}/Calc" method="post"> 
	<label for="first">Сторона a:</label>
	<input type="text" name="first" id="first" value="${first}">
	<label for="second">Сторона b:</label>
	<input type="text" name="second" id="second" value="${second}">
	<input type="submit" name="sign" value="Посчитать">
	</form>
</body>
</html>