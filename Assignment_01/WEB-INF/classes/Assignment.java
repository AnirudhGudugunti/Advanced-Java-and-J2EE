import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Assignment extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String sn=req.getParameter("sn");
		String su=req.getParameter("su");
		if(req.getParameter("sn")=="")
		{
			res.sendError(400,"student name required");
		}
		else{
			pw.println("student name:" +sn);
			pw.println("student usn:" +su);
		/*res.sendRedirect("https://www.google.com/"+sn);*/
		    }
	}
}
		