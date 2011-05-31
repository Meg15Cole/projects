package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *  This is a simple servlet to show plain text output
 *
 *@author    eknapp
 */
public class SimpleTextServlet extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/plain");

        PrintWriter  out  = response.getWriter();
        out.println("<html><body>Hello there!</body></html>");

    }

}

