<%--
  Created by IntelliJ IDEA.
  User: HDD
  Date: 26/09/2019
  Time: 23:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post">
    <input type="number" name="num" size="30"/>
    <input type="number" name="num" size="30">
    <input type="submit" value="Addition(+)" name="choose">
    <input type="submit" value="Subtraction(-)" name="choose">
    <input type="submit" value="Multiplication(*)" name="choose">
    <input type="submit" value="Division(/)" name="choose">
</form>

<h1>Result: ${n}</h1>
</body>
</html>
