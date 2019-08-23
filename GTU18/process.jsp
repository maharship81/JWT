<html>
<head>
	<title> GTU WTAD Practical 26 : Develop an application to write a "page-composite" JSP that includes other pages or passes control to another page.</title>
</head>
<body>

<%
	String c = request.getParameter("color");
	
	if(c==null)
	{
%>
		<jsp:forward page="./index.jsp"/>
<%	}
	else
	{
%>
		<jsp:forward page="<%=c%>"/>
<%
	}
%>
	
</body>
</html>