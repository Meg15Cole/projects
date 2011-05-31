<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="java.util.*, java.io.*"%>
<%!
    private java.util.Properties properties;
    public void jspInit() {
        String propertiesFilePath = "/project3.properties";
        if (properties == null) {
          properties = new Properties();
          loadProperties(propertiesFilePath);
        }

        ServletConfig config = getServletConfig();
        ServletContext context = config.getServletContext();

        context.setAttribute("properties", properties);
        context.getAttribute("properties");

        StringBuilder names = new StringBuilder();
        StringBuilder values = new StringBuilder();

        Enumeration e = properties.propertyNames();

        names.append("<tr>");
        values.append("<tr>");

        while (e.hasMoreElements()) {
          String key = (String) e.nextElement();
          names.append("<th>" + key + "</th>");
          values.append("<td>" + properties.getProperty(key) + "</td>");
        }

         names.append("</tr>");
         values.append("</tr>");

        context.setAttribute("names", names);
        context.setAttribute("values", values);
    }

    public void loadProperties(String propertiesFilePath)  {
        properties = new java.util.Properties();
        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        }
        catch(java.io.IOException ioe) {
            System.out.println("Can't load the properties file");
            ioe.printStackTrace();
        }
        catch(Exception e) {
            System.out.println("Problem: " + e);
            e.printStackTrace();
        }
    }
%>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="description" content="Your description goes here" />
	<meta name="keywords" content="your,keywords,goes,here" />
	<meta name="author" content="Meg Cole" />
	<link rel="stylesheet" type="text/css" href="variant-dark.css" title="Variant Dark" media="screen,projection" />
	<title>Meg's Token Home Page</title>
</head>
<!-- for project4 is %@ include file="/WEB-INF/jsp/fragments/head-tag.jsp" % -->
<body>
<div id="topmenu">
	<p>
		<strong class="hide">Main menu:</strong>
		<a class="active" href="/java112/">Meg's Home Page</a><span class="hide"> | </span>
		<a href="/java112/Project3HTTPRequests.jsp">HTTP Requests</a><span class="hide"> | </span>
		<a href="/java112/Project3SimpleSearch.jsp">Simple Search</a><span class="hide"> | </span>

	</p>
</div>

<div id="header">
    <!--<img src="images/token_one_thirty_two.jpeg" alt="Tokens Sign" />-->
	<div id="title">

		<h1>
		  <a href="/java112/Project3ProjectInformation.jsp">
		                            Project 3 Project Information
		  </a>
		</h1>
	</div>
</div>

<div id="wrap">
  <table>
    <%= application.getAttribute("names") %>
    <%= application.getAttribute("values") %>
  </table>
  <h2><a href="/java112/">Meg's Token Home Page</a></h2>
</div>
</body>
</html>
