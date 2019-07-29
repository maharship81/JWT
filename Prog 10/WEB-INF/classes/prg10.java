import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prg10 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String user = req.getParameter("userName"),pass =req.getParameter("userPass");
	boolean Buser=false,Bpass=false;
	/*
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
	}*/
	if(Buser == false && Bpass==false)
	{
		HttpSession sn = req.getSession();
		sn.setAttribute("userName","");
		sn.setAttribute("","");
		res.sendRedirect("html/prg10.jsp");
	}
	else
	{
		res.sendRedirect("prg8home.jsp");
	}
	out.close();

  }
}