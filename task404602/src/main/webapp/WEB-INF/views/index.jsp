<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Java Server Page</title>
</head>
<body>
	<center>
		<form method="post" action="/task404602/converter">
			<fieldset>
				<legend>
					<h1>Convert Currency</h1>
				</legend>
				<table border="1px">
					<tr>
						<td>USD :</td>
						<td><input type="number" name="usd" value="${usd}"></td>
					</tr>
					<tr>
						<td>Rate :</td>
						<td><input type="number" name="rate" value="${rate}"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Convert"></td>
					</tr>
					<td><span>VND : </span></td>
					<td><span>${vnd}</span></td>
				</table>
			</fieldset>
		</form>
	</center>
</body>
</html>