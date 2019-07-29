/*
		GTU WTAD Practical 18 : Develop a Servlet to authenticate a user, where the loginid and password are available as request parameters. In case the authentication is successful, it should setup a new session and store the user's information in the session before forwarding to home.jsp, which displays the user's information like full name, address, etc.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginVerificationUsingSession extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");      
		out.println("<html><head><title>GTU WTAD Practical 18 : Develop a Servlet to authenticate a user, where the loginid and password are available as request parameters. In case the authentication is successful, it should setup a new session and store the user's information in the session before forwarding to home.jsp, which displays the user's information like full name, address, etc. </title></head><body></h1></center><br><br>");
 
		//===============================================
		// Read parameter value send by page1
		//===============================================
		String s1 = request.getParameter("par1");
		String s2 = request.getParameter("par2");
		
		//===============================================
		// Read Current Session 
		//===============================================
		HttpSession current_session = request.getSession();

		//===============================================
		// Read Session Parameter 1 and 2
		//===============================================		
		String session_value1 = (String) current_session.getAttribute("session_par1");
		String session_value2 = (String) current_session.getAttribute("session_par2");
		
		if( s1.equals("admin") && s2.equals("admin") )
		{
			if( session_value1==null || session_value2==null)
			{
				//===============================================
				// Write Parameter 1 and 2 into Session
				//===============================================
				current_session.setAttribute("session_par1","admin");
				current_session.setAttribute("session_par2","admin");
			}
			
		}
		else
		{
			//===============================================
			// Invalid User redirect to login page
			//===============================================
			response.sendRedirect("index.jsp");
		}
		
	}
}