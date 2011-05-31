<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%!
    private java.util.Properties properties;

    public void jspInit() {
        String propertiesFilePath = "/project2.properties";
        loadProperties(propertiesFilePath);
        System.out.println("Now in the jspInit method!");
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
<html>
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">

    <title></title>
  </head>

  <body>
    <h3>Lab 3-5</h3>
    <h4>Student: <%= properties.getProperty("author")%></h4>
    <h5>Student Email: <%= properties.getProperty("author.email")%></h5>
    <h5>Course: <%= properties.getProperty("course")%></h5>
  </body>
</html>


