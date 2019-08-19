<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Sign In</title>
</head>
<body>
<div class="container-fluid">
<form class="box" action="adminController" method="post">
<input type="hidden" name="command" value="USER">
<%
String msg =(String)request.getAttribute("msg");
if(msg != null){
	%>
	<h3 style="color: green;"><%= msg %> </h3>
	<% }  %>



<table>
<tr>
				
				<td><input type="text" name="userId" placeholder="ADMIN ID"></td>

			</tr>
			<tr>
			
				<td><input type="password" name="password" placeholder="PASSWORD"></td>

			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="login" ></td>
			</tr>

</table>

</form>
</div>
</body>
</html>