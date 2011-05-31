package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *  ///////
 *
 *@author    Meg Cole
 */
public class First112Servlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter  out  = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD>");
        out.print("<TITLE>First112Servlet</TITLE>");
        out.print("<link rel='stylesheet' type='text/css' href='/variant-dark.css' title='Variant Dark' media='screen,projection' />");
        out.print("</HEAD>");
        out.print("<BODY>");
        out.print("<h1>First 112 Servlet</h1>");
        out.print("<p class='slogan'>Meg Cole<br />Advanced Java 112</p><br />");
        out.print("<p><img src='/images/pretty_flower.jpg' alt='Pretty Flower' /></p>");
        out.print("<h2><a href='/java112/'>Back to Meg's Home Page</a></h2>");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();

    }

}

