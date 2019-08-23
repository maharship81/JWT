<html>
	<head>
		<title>GTU WTAD Practical 15</title>
	</head>
	<body>
	
	<h2 align="center"> GTU WTAD Practical 15 :   Develop a interest calculation application in which user will provide all information in HTML form and that will be processed by servlet and response will be generated back to the user.</h2>
	
	
	
		<table>
		<tr>
			<th>Interest Calculation </th>
		</tr>
		<tr>
		<td>
		<form action="./InterestCalculation" method="post">
			Principal Amount : <input type="text" name="p"> <br>
			Rate of Interest : <input type="text" name="r"> <br>
			Year : <input type="text" name="n"> <br>
			<input type="submit" value="Calculate">
			
		</form>
		<br><br>
		<div> 
		<%
			String s = request.getParameter("interest");
			String p = request.getParameter("p");
			String r = request.getParameter("r");
			String n = request.getParameter("n");
			
			if(s!=null)
			{
				out.println("<b>Simple Interest is as follow:</b><br>");
				out.println("Pincipal Amount : " + p + "<br>");
				out.println("Rate of Interest : " + r + "<br>");
				out.println("Years : " + n + "<br>");
				out.println("\n\n SI is : " + s);
			}
		%>
		
		</div>
		</td>
		</tr>
		</table>
	</body>
</html>
