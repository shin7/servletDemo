<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo</title>
</head>
<body>
	<h1>Demo Servlet Request Response</h1>
	<table border="1">
		<tr bgcolor='#C6C6C6'>
			<th>Attribute</th>
			<th>Value</th>
		</tr>
		<tr>
			<td>Name</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>URI</td>
			<td>${uri}</td>
		</tr>
		<tr>
			<td>Method</td>
			<td>${method}</td>
		</tr>
		<tr>
			<td>Protocol</td>
			<td>${protocol}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${remoteAddress}</td>
		</tr>
		
	</table>

</body>
</html>