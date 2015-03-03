package ch02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello2 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// 设置Content-Type首部
		res.setContentType("text/html");
		// 如果是一个HEAD，先返回
		if (req.getMethod().equals("HEAD"))
			return;
		// 否则继续
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("Hello, " + name);
		out.println("</BODY></HTML>");
	}
}
