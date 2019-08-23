<html>
	<head>
		<title>GTU WTAD Practical 13 : Create a Java class called Product with the following properties: name, description, price.  Create a listener that notifies (through System.out) whenever a user adds a product to a shopping cart (i.e. adds an object to the session object) or removes it again. Hint: check out the class HttpSessionAttributeListener. Make it print the name and price of the object (hint: access the session through the HttpBindingEvent object). Also, let the listener print the total price of all objects saved in the session so far (one way to accomplish this could be to keep a collection of all objects saved to the session  –  or just their keys  –  in the listener or an associated class).</title>
	</head>
	<body>
	
		<br><h2>GTU WTAD Practical 13 : Create a Java class called Product with the following properties: name, description, price.  Create a listener that notifies (through System.out) whenever a user adds a product to a shopping cart (i.e. adds an object to the session object) or removes it again. Hint: check out the class HttpSessionAttributeListener. Make it print the name and price of the object (hint: access the session through the HttpBindingEvent object). Also, let the listener print the total price of all objects saved in the session so far (one way to accomplish this could be to keep a collection of all objects saved to the session  –  or just their keys  –  in the listener or an associated class).</h2><br><br><br>
		<center><h2>Select Product wish to purchase. </h2></center>
		<form method="GET" action="product">
			Mouse : <input type="checkbox" name="mouse" value="100"> </br>
			Keyboard : <input type="checkbox" name="keyboard" value="200"> </br>
			Monitor : <input type="checkbox" name="monitor" value="3000"> </br>
			<input type="submit" value="Add to Cart">
			
		</form>
	
		<br><br><br><br><br><br><br><br><br><br><br><br>
		
	</body>
</html>