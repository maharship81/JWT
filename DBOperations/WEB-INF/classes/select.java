import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.sql.*;

public class select extends HttpServlet {

		public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException,ServletException
		{
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			String name="";

			try
			{
				//Class.forName("com.mysql.cj.jdbc.Driver"); 
				out.println("<h1 align='center'>Your Result Is:</h1>");
				Connection con=DriverManager.getConnection( "jdbc:mysql://localhost/jwt","root","");
			
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from student_marksheets ");  
						
				out.println("<table border=1 align='center'>");
				out.println("<tr><th>Enrollment</th><th>Name</th><th>JWT</th><th>SM</th><th>MC</th><th>DS</th><th>PERCENTAGE(%)</th></tr>");
				
				while(rs.next())
				{  
					//name=""+rs.getString(1);
                    out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getInt(5)+"</td><td>"+rs.getInt(6)+"</td><td>"+rs.getInt(7)+"</td>"+
                    "<td><a href='delete?enrol="+rs.getInt(1)+"'>Delete</a></td></tr>");
				}
                out.println("</table>");
                
                
                out.println("<table Border=2 align='center'>");
                out.println("<tr><td><a href='html/Insert.html'>Insert</a></td>");
                out.println("<td><a href='html/Update.html'>Update</a></td>");
                out.println("<td><a href='html/Delete.html'>Delete</a></td></tr>");
                out.println("</table>");
				con.close();

			}
			catch(Exception ex)
			{
				out.println("Exception:-"+ex);
			}
			finally
			{  
				out.close();
			}
		}
}