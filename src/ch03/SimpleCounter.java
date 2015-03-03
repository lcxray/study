package ch03;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleCounter extends HttpServlet {

	int count = 0;
	int local_count;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		synchronized (this) {
			local_count = ++count;
		}
		out.println("Since loading, this servlet has been accessed " + count
				+ " times.");

	}
}
