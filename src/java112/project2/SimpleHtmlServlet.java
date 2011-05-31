package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *  This is a simple servlet to show html output
 *
 *@author    eknapp
 */
public class SimpleHtmlServlet extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter  out  = response.getWriter();
        out.println("<html><body>Hello there!</body></html>");

    }

}

