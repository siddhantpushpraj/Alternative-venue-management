<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>User Page</title>
</head>
<body>
<h1>AVM</h1>
		
		<div class="container-fluid">
		
		<form  action="venueController" name="COMMAND" method="get">
			<table border="1" rules="all">
				<tr>
					<td>Select Weekday</td>
					<td>
						<select name="day">
								<option>Select Weekday</option>
								<option value="monday">Monday</option>
								<option value="tuesday">Tuesday</option>
								<option value="wednesday">Wednesday</option>
								<option value="thursday">Thursday</option>
								<option value="friday">Friday</option>
								<option value="saturday">Saturday</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Select Lecture</td>
					<td>
						<select name="lecture">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
						</select>
					</td>

				</tr>
				<tr>
					<td colspan="2" style="text-align: center"><input type="submit" value="show" name="COMMAND"></td>
				</tr>
			</table>
		</form>
		
		</div>
		
		<br>
		
		
		
<div class="container">
		
<table border="1" rules="all">
<tr>
<td>FREE LECTURE HALL</td>
</tr>
<c:forEach var="freeLecture" items="${ROOMS}">
<tr>
<td>${freeLecture.room}</td>
</tr>

</c:forEach>
</td>
</tr>
</table>
		
</div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<div class="container">
	
	
	<a href="indexPage.jsp"><button>logout</button> </a>
</div>
</body>
</html>