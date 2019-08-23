<html>
	<head>
		<title>GTU WTAD Practical 26</title>
	</head>
	<body>
	
	<h2 align="center"> GTU WTAD Practical 26 :  Develop an application to write a "page-composite" JSP that includes other pages or passes control to another page.   </h2>
	<br><br><br>
	<form method="get" action="process.jsp">
		<b>Select Your Favorite Color :</b> 	<br><br>
		<input type="radio" name="color" value="red.jsp"> Red			<br>
		<input type="radio" name="color" value="green.jsp"> Green	<br>
		<input type="radio" name="color" value="blue.jsp"> Blue		<br><br>
		<input type="submit" value="Click Here">
	</form>
	<br><br><br><br><br><br>
	<jsp:include page="footer.jsp"/>
	</body>
</html>
