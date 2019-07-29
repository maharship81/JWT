import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.sql.*;
public class prg7 extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException,ServletException
		{
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			String name="";
			try
			{
				//need restart after adding exts i think so restart ur lappy
				//Class.forName("com.mysql.cj.jdbc.Driver");what is ur email id???
				out.println("<h1 align='center'>Your Result Is:</h1>");
			    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student_marks","root","");
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from stud where eno ="+req.getParameter("enrolment"));  
//				ResultSet rs=stmt.executeQuery("select * from stud");  
						
				out.println("<table border=1 align='center'>");
				out.println("<tr><th>JWT</th><th>SM</th><th>MC</th></tr>");
				while(rs.next())
				{  
					//name=""+rs.getString(1);
					out.println("<tr><td>"+rs.getInt(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getInt(5)+"</td></tr>");
					name=rs.getString(2);
				}
				out.println("</table>");
				out.println("<h4 align='center'>Your Enrolment No:"+req.getParameter("enrolment")+"</h4>");
				out.println("<h4 align='center'>Your Name:"+name+"</h4>");
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
