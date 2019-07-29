<html>
	<head>
		<title>GTU WTAD Practical 9</title>
	</head>
	<body>
	
	<h2 align="center"> GTU WTAD Practical 9 : Develop a Servlet to authenticate a user, where the loginid and password are available as 
	request parameters. In case the authentication is successful, 
	it should setup a new session and store the user's information in the session before forwarding to home.jsp, 
	which displays the user's information like full name, address, etc. </h2>
	
	
		<form action="/GTU9/LoginVerificationUsingSession" method="get">
	
			<table>
				<tr><th colspan="2">Login</th></tr>
				<tr><td>Username : </td><td>  <input type="text" name="par1" value=""> </td></tr>
				<tr><td>Password : </td><td>  <input type="password" name="par2" value=""> </td></tr>
				<tr><td colspan="2"><input type="submit" value="Login"></td></tr>
			</table>
		</form>
	</body>
</html>