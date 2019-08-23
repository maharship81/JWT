<%@ page import="java.sql.*;" %>
<html>
	<head>
		<title>GTU WTAD Practical 28</title>
	</head>
	<body>
	
	<h2 align="center"> GTU WTAD Practical 28 :    Develop a program to perform the database driven operation like insert, Delete, Update and select. To perform the above operations create one table named Employee. Field Name   Field Type EmpId Integer Empname Varchar Emp_desig Varchar Emp_J_Date Varchar Emp_Salary Numeric </h2>
	<br><br>
		
		<form method="post" action="./UpdateServlet">
		
		<%
			
			
			Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery("Select * from employee where EmpId=" + request.getParameter("id") );
			out.println("<center><table border=1>");
			out.println("<tr><th>Field</th><th>Details</th></tr>");
			
			if(rs.next())
			{
				 out.println("<tr><td>Employee ID</td><td> <input name=\"EmpId\" readonly type=\"text\" value="+rs.getInt(1)+"> </td></tr>");
				 out.println("<tr><td>Employee Name</td><td> <input name=\"Empname\" type=\"text\" value="+rs.getString(2)+ "> </td></tr>");
				 out.println("<tr><td>Employee Designation</td><td> <input name=\"Emp_desig\" type=\"text\" value="+rs.getString(3)+ "></td></tr>");
				 out.println("<tr><td>Employee Joining Date</td><td> <input name=\"Emp_J_Date\" type=\"text\" value="+rs.getString(4)+ "></td></tr>");
				 out.println("<tr><td>Employee Salary</td><td> <input name=\"Emp_Salary\" type=\"text\" value="+rs.getFloat(5)+ "></td></tr>");
			}
			
			out.println("</table>");			
		%>
		
		<tr><td colspan="2"> <input type="submit" value="Update"> </td></tr>
		</table>
		
	</form>
		
	</body>
</html>
