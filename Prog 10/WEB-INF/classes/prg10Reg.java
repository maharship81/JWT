import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prg10Reg extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String 	user = req.getParameter("userName"),
			add =req.getParameter("address"),
			mob =req.getParameter("mobile"),
			city =req.getParameter("city"),
			state =req.getParameter("state");

	HttpSession sn = req.getSession();
	sn.setAttribute("userName",user);
	sn.setAttribute("","");
	res.sendRedirect("prg10.jsp");
	out.close();

  }
}