<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%!

    private String name = "Meg Cole";

    public String getName() {
        return name;
    }

%>

<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org" />

    <title>Lab 3-3</title>
  </head>

  <body>
    <h3>Lab 3-3</h3>

    <h4>This page has been written by <%= getName() %>.</h4>
  </body>
</html>

