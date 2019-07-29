import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prg5 extends HttpServlet
{
    static int count =1;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String k=String.valueOf(count);
        Cookie c = new Cookie("visit",k);
        response.addCookie(c);
        int j=Integer.parseInt(c.getValue());
        if(j==1)
        {
            out.println("Welcome");
        }
        else
        {
            out.println("You visited "+count+" times");
        }
                count++;                        
    }
}
