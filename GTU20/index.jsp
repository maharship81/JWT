<%@ page import="java.sql.*;" %>
<html>
	<head>
		<title>GTU WTAD Practical 28</title>
	</head>
	<body>
	
	<h2 align="center"> GTU WTAD Practical 28 :    Develop a program to perform the database driven operation like insert, Delete, Update and select. To perform the above operations create one table named Employee. Field Name   Field Type EmpId Integer Empname Varchar Emp_desig Varchar Emp_J_Date Varchar Emp_Salary Numeric </h2>
	<br><br>
	
	<form method="post" action="InsertServlet">
		<table>
		<tr><td colspan="2"> Employee Details </td></tr>
		<tr><td colspan="2"> &nbsp; </td></tr>
		<tr><td>Employee Id</td> <td> <input type="text" name="EmpId"></td></tr>
		<tr><td>Employee Name</td> <td> <input type="text" name="Empname"></td></tr>
		<tr><td>Employee Designation</td> <td> <input type="text" name="Emp_desig"></td></tr>
		<tr><td>Employee Joining Date</td> <td> <input type="text" name="Emp_J_Date"></td></tr>
		<tr><td>Employee Salary</td> <td> <input type="text" name="Emp_Salary"></td></tr>
		<tr><td colspan="2"> &nbsp; </td></tr>
		<tr><td colspan="2"> <input type="submit" value="Insert"> </td></tr>
		</table>
		
		<%
			String s = (String) session.getAttribute("msg");
			
			if(s!=null)
			{
				out.println("<div align=\"left\"><font color=\"blue\">"+s+"</font></div>");
				session.removeAttribute("msg");
			}
			
			
			Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery("Select * from employee");
			out.println("<center><table border=1>");
			out.println("<tr><th>Emp ID </th><th>Employee Name</th><th>Designation</th><th>Joinnig Date</th><th>Salary</th><th>Edit</th><th>Delete</th></tr>");
			
			while(rs.next())
			{
				 out.println("<tr><td>"+rs.getInt(1)+" </td>");
				 out.println("<td>"+rs.getString(2)+ "</td>");
				 out.println("<td>"+rs.getString(3)+ "</td>");
				 out.println("<td>"+rs.getString(4)+ "</td>");
				 out.println("<td>"+rs.getFloat(5)+ "</td>");
				 out.println("<td> <a href=edit.jsp?id="+rs.getInt(1)+ "> Edit </a> </td>");
				 out.println("<td> <a href=./DeleteServlet?id="+rs.getInt(1)+ "> Delete </a> </td></tr>");
			}
			out.println("</table></center>");			
		%>
	</form>
		
	</body>
</html>
