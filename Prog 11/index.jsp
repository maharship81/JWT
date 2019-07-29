<html>
	<head>
		<title>GTU WTAD Practical 11</title>
	</head>
	<body>
	
		<h2 align="center"> GTU WTAD Practical 11 :  Write a simple JSP page to display a simple message (It may be a simple html page) </h2>
	
	
		<%
			out.println("<br><br>Hello using JSP");
			/* This is JSP Comments Line */
			out.println("<br><br><b>Following are the Implicit Objects Available in JSP</b>");
			out.println("<ol><li> request");
			out.println("<li> response");
			out.println("<li> session");
			out.println("<li> out");
			out.println("<li> application");
		%>
	</body>
</html>