<%
		String session_value = (String)session.getAttribute("user");
		if (session_value != null) 
		{ 
			response.sendRedirect("./Welcome");
		}
%>
<html>
	<head>
		<title>GTU WTAD Practical 17</title>
	</head>
	<body>
	
	<h2 align="center"> GTU WTAD Practical 17 : Develop an application to keep track of one user across several servlet invocations within the same browser session. </h2>

		<table>
		<tr>
			<th>Session Tracking </th>
		</tr>
		<tr>
		<td>
			<form action="./Welcome" method="post">
				Username : <input type="text" name="u"> <br>
				Password : <input type="password" name="p"> <br>
				<input type="submit" value="Login">
			</form>
			<br><br>
		</td>
		</tr>
		</table>
	</body>
</html>
