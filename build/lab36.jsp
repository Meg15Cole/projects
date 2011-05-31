<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="java.util.*, java.io.*"%>
<%!
    public void jspInit() {
        Properties properties = new Properties();
        loadProperties("/analyzer.properties", properties);

        ServletConfig config = getServletConfig();
        ServletContext context = config.getServletContext();

        context.setAttribute("properties", properties);

        String bigWordsMinLength =
                              properties.getProperty("bigwords.minimum.length");

        context.setAttribute("bigWordsMinLength", bigWordsMinLength);
        context.getAttribute("bigWordsMinLength");

        //use the ServletContext object through the context reference.
    }
    public Properties loadProperties(String propertiesFilePath, Properties properties)  {
        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        }
        catch(IOException ioe) {
            System.out.println("Can't load the properties file");
            ioe.printStackTrace();
        }
        catch(Exception e) {
            System.out.println("Problem: " + e);
            e.printStackTrace();
        }
    return properties;
  }

%>
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">

    <title>Lab 3-6</title>
  </head>

  <body>
    <h3>Properties for bigWordsMinLength is
        <%= application.getAttribute("bigWordsMinLength")%></h3>
  </body>
</html>


