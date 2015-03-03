package ch02;
/**
 * @author LeiChenXi
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    String servletinfo = getServletInfo();

    out.println("<HTML>");
    out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
    out.println("<BODY>");
    out.println("<BIG>Hello World</BIG>");
    out.println(servletinfo+"servletinfo");
    out.println("</BODY></HTML>");
  }
}
