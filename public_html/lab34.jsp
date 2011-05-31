<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org" />

    <title>JSP Expressions</title>
  </head>

  <body>
    <h3>Lab 3-2 by Meg Cole</h3>

    <ul>
      <li>HTTP request type: <%= request.getMethod() %></li>

      <li>Current time: <%= new java.util.Date() %></li>

      <li>Server: <%= application.getServerInfo() %></li>

      <li>Session ID: <%= session.getId() %></li>

      <li>The <code>testParam</code> form parameter: <%=
      request.getParameter("number") %></li>

      <li>
      <% int inputNumber = Integer.parseInt(request.getParameter("number"));
         int labNumber = inputNumber%2;
         String message;

         if (labNumber == 0) {
             message ="number is even";
         } else {
             message = "number is odd";
         }
         out.print(message);
      %>
      </li>
    </ul>
  </body>
</html>
