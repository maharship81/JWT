import java.io.*;

import java.util.*;

import javax.servlet.*;

import javax.servlet.http.*;



public class gtu66 extends HttpServlet 
{

    
	private static final long serialVersionUID = 1L;

    
	@Override
    
	public void doGet(HttpServletRequest req,HttpServletResponse res)
throws IOException, ServletException
    
	{
      
		res.setContentType("text/html");
       
		PrintWriter out = res.getWriter();
	
		String st = "Load PDF files";
	
		out.println("<title>"+st+"</title><body><center>");
	
		out.println("<form method =POST>");
	
		out.println("<select size=1 name=syll><br><br>");
	
		out.println("<option>mca1</option>");
	
		out.println("<option>mca2</option>");
	
		out.println("<option>mca3</option>");
	
		out.println("</select><br><br>");
	
		out.println("<input type=submit value=show>");
	
		out.println("</form>");
	out.println("</center></body>");
	
	
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
	
	{
		
		String st=request.getParameter("syll");
		
		response.setContentType("application/pdf");
		
		if(st.equals("mca1"))
		
		{
			
			response.sendRedirect("./mca-1.pdf");	
		
		}
		
		else if(st.equals("mca2"))
		
		{
			
			response.sendRedirect("./mca-2.pdf");	
		
		}
		
		else if(st.equals("mca3"))
		
		{
			
			response.sendRedirect("./mca-3.pdf");	
		
		}
	
	
}
}