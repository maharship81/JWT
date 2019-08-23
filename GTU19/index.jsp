<html>
	<head>
		<title>GTU WTAD Practical 27</title>
	</head>
	<body>
	<h2 align="center"> GTU WTAD Practical 27 :   You want to reduce the amount of Java coding in your JSP using a JavaBean component. (Hint:  Use &ltjsp:useBean&gt with the name of your bean).   </h2>
	<br><br>
	<jsp:useBean id="date" class="java.util.Date" /> 
	<h2>Todays Date is : <font color="red"> <%= date %> </font> </h2>
	</body>
</html>
