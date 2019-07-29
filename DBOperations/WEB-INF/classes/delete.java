import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.sql.*;

public class delete extends HttpServlet {

		public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException,ServletException
		{
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			String enrolment="";
			try
			{
				if(req.getParameterNames()!=null)
				{
					//spelling
					enrolment = req.getParameter("enroll");
				}
				//Class.forName("com.mysql.cj.jdbc.Driver"); 
				out.println("<h1 align='center'>Your Result Is:</h1>");
				Connection con=DriverManager.getConnection( "jdbc:mysql://localhost/jwt","root","");
				Statement statement = con.createStatement();
				//using default value for now
				
				statement.execute("delete from student_marksheets where enrolment="+enrolment);
				out.println("Data Deleted..."+enrolment);
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