import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class gtu4 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
	
	out.println("<html><head><title>Write a Servlet to display all the attributes available from request and context.</title></head>");

	out.println("<table border=1>");
	out.println("<tr><th>Request Context</th><th>Parameter values</th></tr>");

	out.println("<tr><td><b>"+"Local Name:getLocalName()" +"</b></td><td>"+request.getLocalName()+"</td></tr>");
	out.println("<tr><td><b>"+"Local Port:getLocalPort()" +"</b></td><td>"+request.getLocalPort()+"</td></tr>");
	out.println("<tr><td><b>"+"Protocol:getLocalProtocol()" +"</b></td><td>"+request.getProtocol()+"</td></tr>");
	out.println("<tr><td><b>"+"Remote Address:getLocalAddr()" +"</b></td><td>"+request.getLocalAddr()+"</td></tr>");
	out.println("<tr><td><b>"+"Server Name :getServerName()" +"</b></td><td>"+request.getServerName()+"</td></tr>");
	out.println("<tr><td><b>"+"Server Port :getServerPort()" +"</b></td><td>"+request.getServerPort()+"</td></tr>");
	out.println("<tr><td><b>"+"Char Encoding:getCharacterEncoding()" +"</b></td><td>"+request.getCharacterEncoding()+"</td></tr>");
	out.println("<tr><td><b>"+"Content Type:getContentType()" +"</b></td><td>"+request.getContentType()+"</td></tr>");
	out.println("<tr><td><b>"+"Context Length:getContentLength()" +"</b></td><td>"+request.getContentLength()+"</td></tr>");
	

	out.println("</table>");
	out.println("</body></html>");

}
}