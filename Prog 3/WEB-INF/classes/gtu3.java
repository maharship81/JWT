import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class gtu3 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
	//out.println("<br><b>User:</b>:"+ request.getParameter("usr")+"<br><b>Password</b>:"+ request.getParameter("pwd")+"");
	out.println("<html><head><title>Write a Servlet to display parameters available on request. .</title></head><body><center><h1>write a Servlet to display parameters available on request.</h1></center><br><br>");
		//display haeder name and value in table format 
	out.println("<table border=1>");
	out.println("<tr><th>Parameter name</th><th>parameter values</th></tr>");
	Enumeration e=request.getParameterNames();
	while(e.hasMoreElements())
	{
		String header_name=(String) e.nextElement();
		String header_value=(String)request.getParameter(header_name);
		out.println("<tr><td><b>"+header_name+"</b></td><td>"+header_value+"</td></tr>");
	}
	out.println("</table>");
	out.println("</body></html>");

}
}
