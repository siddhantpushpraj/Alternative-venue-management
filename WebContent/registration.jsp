<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h3>Registration Form</h3>

	<div class="container">
	<form class="box" action="adminController" method="post">
	<input type="hidden" name="command" value="ADD" >
	<%
String msg =(String)request.getAttribute("msg");
if(msg != null){
	%>
	<h3 style="color: green;"><%= msg %> </h3>
	<% }  %>
	
		<table>
			<tr>
				
				<td><input type="text" name="userId" placeholder="USER _ID"></td>

			</tr>
			<tr>
				
				<td><input type="password" name="password" placeholder="PASSWORD"></td>

			</tr>
			<tr>
				
				<td><input type="text" name="Name" placeholder="NAME"></td>

			</tr>
			

		</table>
		<input type="submit" name="login">
	</form>
	</div>
</body>
</html>