import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class headerjwt extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String title="header Title for jwt";
	
	out.println("<HTML>\n" + 
	"<HEAD><TITLE>" + title +" </TITLE></HEAD>\n" + 
	"<BODY BGCOLOR=\"#FDFSE6\">\n" + 
	"<H1 align=\"CENTER\">" + title +"</H1>\n" + 
	
	"<B> Request method:</B>" + 
	
	request.getMethod() +"<BR>\n" + 
	"<B> Request URI:</B>"+
	
	request.getRequestURL()+ "<BR>\n"+ 
	"<B> Request Protocol:</B> "+

        request.getProtocol()+"<BR>\n"+
	"<TABLE BORDER=1 ALIGN=\"CENTER\">\n"+
	
	"<TR BGCOLOR=\"#FFAD00\">\n"+
	"<TH>Header Name</TH>Header value</TR>");

	Enumeration headerNames=request.getHeaderNames();
	//Enumeration headerEnumeration = headers.getAllHeaders();			
	while(headerNames.hasMoreElements())
	{
		String headerName=(String)headerNames.nextElement();
		out.println("<TR><TD>"+headerName);
		out.println("</TD></TR>"+ request.getHeader(headerName));
	}
	out.println("</TABLE>\n</BODY></HTML>");
    }
}