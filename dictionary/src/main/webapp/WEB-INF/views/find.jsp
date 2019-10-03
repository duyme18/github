<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Java Server Page</title>
</head>
<body>
	<h1>Dictionary</h1>
	<form class="form-control" method="post">
		<input name="en" type="text" /> <input type="submit" value="find" />
	</form>
	<h1>${en}${dash}${vn}</h1>
</body>
</html>