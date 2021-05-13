import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class Assignment02 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		HttpSession hs = req.getSession(true);
		Date d = (Date) hs.getAttribute("date");
		if (d == null) {
			hs.setAttribute("preuser", "");
			hs.setAttribute("curuser", "");
		}
			String pre = (String) hs.getAttribute("preuser");
			String cur = (String) hs.getAttribute("curuser");
			if (d != null && pre != "") {
			pw.println("<b>Last access date and time: " + d + "<br>");
			pw.println("<b>Last accessed user name:" + pre + "<br>");

		}
		d = new Date();
		hs.setAttribute("date", d);
		pre= req.getParameter("name");
		hs.setAttribute("username", pre);
		pre = cur;
		pw.println("<b>Current date and time is:" + d);
		pw.println("<b>Current user name is:" + pre);
		hs.setAttribute("preuser", pre);

	}
}