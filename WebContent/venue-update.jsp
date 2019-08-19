<html>
<head>
<title>Schedule Editor</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Schedule Editor</h1>
	<div class="container-fluid">
	
	<form class="form" action="venueController" method="get" name = "COMMAND">
		<table border="1" rules="all">
			<tr>
				<td> </td>
				<td colspan="8">
				<select name="room">
				<option>Select lecture hall</option>
				<option>tg001</option>
				<option>tg002</option>
				<option>tg003</option>
				<option>tg004</option>
				<option>tg005</option>
				<option>tg006</option>
				<option>tg007</option>
				<option>tg008</option>
				<option>tg009</option>
				<option>tg101</option>
				<option>tg102</option>
				<option>tg103</option>
				<option>tg104</option>
				<option>tg105</option>
				<option>tg106</option>
				<option>tg107</option>
				<option>tg108</option>
				<option>tg109</option>
				<option>tg201</option>
				<option>tg202</option>
				<option>tg203</option>
				<option>tg204</option>
				<option>tg205</option>
				<option>tg206</option>
				<option>tg207</option>
				<option>tg208</option>
				<option>tg209</option>
				<option>tg301</option>
				<option>tg302</option>
				<option>tg303</option>
				<option>tg304</option>
				<option>tg305</option>
				<option>tg306</option>
				<option>tg307</option>
				<option>tg308</option>
				<option>tg309</option>
				<option>tg401</option>
				<option>tg402</option>
				<option>tg403</option>
				<option>tg404</option>
				<option>tg405</option>
				<option>tg406</option>
				<option>tg407</option>
				<option>tg408</option>
				<option>tg409</option>
				</select>
				
				</td>
			</tr>
			<tr>
				<td colspan="9" ></td>
			</tr>
	
	
			<tr>
				<td></td>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>6</td>
				<td>7</td>
				<td>8</td>
			</tr>
			<tr>
				<td>Monday</td>
				<td><input type="checkbox" name="monday1" value="1"></td>
				<td><input type="checkbox" name="monday2" value="1"></td>
				<td><input type="checkbox" name="monday3" value="1"></td>
				<td><input type="checkbox" name="monday4" value="1"></td>
				<td><input type="checkbox" name="monday5" value="1"></td>
				<td><input type="checkbox" name="monday6" value="1"></td>
				<td><input type="checkbox" name="monday7" value="1"></td>
				<td><input type="checkbox" name="monday8" value="1"></td>
			</tr>
			<tr>
				<td>Tuesday</td>
				<td><input type="checkbox" name="tuesday1" value="1"></td>
				<td><input type="checkbox" name="tuesday2" value="1"></td>
				<td><input type="checkbox" name="tuesday3" value="1"></td>
				<td><input type="checkbox" name="tuesday4" value="1"></td>
				<td><input type="checkbox" name="tuesday5" value="1"></td>
				<td><input type="checkbox" name="tuesday6" value="1"></td>
				<td><input type="checkbox" name="tuesday7" value="1"></td>
				<td><input type="checkbox" name="tuesday8" value="1"></td>
			</tr>
			<tr>
				<td>Wednesday</td>
				<td><input type="checkbox" name="wednesday1" value="1"></td>
				<td><input type="checkbox" name="wednesday2" value="1"></td>
				<td><input type="checkbox" name="wednesday3" value="1"></td>
				<td><input type="checkbox" name="wednesday4" value="1"></td>
				<td><input type="checkbox" name="wednesday5" value="1"></td>
				<td><input type="checkbox" name="wednesday6" value="1"></td>
				<td><input type="checkbox" name="wednesday7" value="1"></td>
				<td><input type="checkbox" name="wednesday8" value="1"></td>
			</tr>
			<tr>
				<td>Thursday</td>
				<td><input type="checkbox" name="thursday1" value="1"></td>
				<td><input type="checkbox" name="thursday2" value="1"></td>
				<td><input type="checkbox" name="thursday3" value="1"></td>
				<td><input type="checkbox" name="thursday4" value="1"></td>
				<td><input type="checkbox" name="thursday5" value="1"></td>
				<td><input type="checkbox" name="thursday6" value="1"></td>
				<td><input type="checkbox" name="thursday7" value="1"></td>
				<td><input type="checkbox" name="thursday8" value="1"></td>
			</tr>
			<tr>
				<td>Frvalueay</td>
				<td><input type="checkbox" name="frvalueay1" value="1"></td>
				<td><input type="checkbox" name="frvalueay2" value="1"></td>
				<td><input type="checkbox" name="frvalueay3" value="1"></td>
				<td><input type="checkbox" name="frvalueay4" value="1"></td>
				<td><input type="checkbox" name="frvalueay5" value="1"></td>
				<td><input type="checkbox" name="frvalueay6" value="1"></td>
				<td><input type="checkbox" name="frvalueay7" value="1"></td>
				<td><input type="checkbox" name="frvalueay8" value="1"></td>
			</tr>
			<tr>
				<td>Saturday</td>
				<td><input type="checkbox" name="saturday1" value="1"></td>
				<td><input type="checkbox" name="saturday2" value="1"></td>
				<td><input type="checkbox" name="saturday3" value="1"></td>
				<td><input type="checkbox" name="saturday4" value="1"></td>
				<td><input type="checkbox" name="saturday5" value="1"></td>
				<td><input type="checkbox" name="saturday6" value="1"></td>
				<td><input type="checkbox" name="saturday7" value="1"></td>
				<td><input type="checkbox" name="saturday8" value="1"></td>
			</tr>
			<tr>
				<td colspan=9 style="text-align: center"><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	<br>
	<h4>go to</h4>
	</div>
	<div class="container">
	<a href="registration.jsp"><button>ADD NEW USER </button>  </a>
	
	<a href="user-page.jsp"><button>VIEW FREE LECTURE HALL</button> </a>
	
	<a href="indexPage.jsp"><button>logout</button> </a>
	</div>
	
</body>
</html>