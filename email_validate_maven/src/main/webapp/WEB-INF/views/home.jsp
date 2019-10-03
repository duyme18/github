<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Java Server Page</title>
</head>
<body>
	<h1>Email Validate</h1>
	<h3 style="color: red">${message}</h3>
	<form action="validate" method="post">
		<input type="text" name="email"><br> <input type="submit"
			value="Validate">
	</form>
</body>
</html>