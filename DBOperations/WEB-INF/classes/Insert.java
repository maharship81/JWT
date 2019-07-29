import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.sql.*;

public class Insert extends HttpServlet {

		public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException,ServletException
		{
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			String enrolment="",name="",jwt="",sm="",mc="",ds="",per="";

			try
			{
				if(req.getParameterNames()!=null)
				{
					enrolment = req.getParameter("enroll");
					name = req.getParameter("name");
					jwt = req.getParameter("jwt");
					sm = req.getParameter("sm");
					mc = req.getParameter("mc");
					ds = req.getParameter("ds");
					per = req.getParameter("per");
				}

				//Class.forName("com.mysql.cj.jdbc.Driver"); 
				out.println("<h1 align='center'>Your Result Is:</h1>");
				Connection con=DriverManager.getConnection( "jdbc:mysql://localhost/jwt","root","");
				Statement statement = con.createStatement();
				
				statement.execute("insert into student_marksheets values("+enrolment+",'"+name+"',"+jwt+","+sm+","+mc+","+ds+","+per+")");
				out.println("Data inserted...");
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