import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class LoginVerificationUsingCookies extends HttpServlet
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String user = req.getParameter("userName"),pass =req.getParameter("userPass");
	boolean Buser=false,Bpass=false;
	Cookie[] mc = req.getCookies();
	for(Cookie tmp : mc)
	{
		if(tmp.getName().equals("userName") && tmp.getValue().equals(user))
		{
			Buser=true;
		}			
		if(tmp.getName().equals("userPass") && tmp.getValue().equals(pass))
		{
			Bpass=true;
		}			
	}
	if(Buser == false && Bpass==false)
	{
		Cookie newUser = new Cookie("userName",user), newPass = new Cookie("userPass",user);
		res.addCookie(newUser);
		res.addCookie(newPass);
		res.sendRedirect("index.jsp");
	}
	else
	{
		res.sendRedirect("home.jsp");
	}
	out.close();

  }
}