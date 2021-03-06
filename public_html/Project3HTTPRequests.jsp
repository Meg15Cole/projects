<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="java.util.*, java.io.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">
    <link rel="stylesheet" type="text/css" href="variant-dark.css" title="Variant Dark" media="screen,projection" />
    <title>Project 3 HTTP Requests</title>
  </head>

  <body>
    <div id="topmenu">
	  <p>
		<strong class="hide">Main menu:</strong>
		<a class="active" href="/java112/">Meg's Home Page</a><span class="hide"> | </span>
		<a href="/java112/Project3ProjectInformation.jsp">Project Information</a><span class="hide"> | </span>
		<a href="/java112/Project3SimpleSearch.jsp">Simple Search</a><span class="hide"> | </span>
		<!--<a href="#">Page four</a><span class="hide"> | </span>
		<a href="#">Page five</a>-->
	  </p>
	</div>

    <div id="header">

	  <div id="title">
		<h1>
		 <a href="/java112/Project3HTTPRequests.jsp">Project 3 HTTP Requests</a>
		</h1>
		<!--<p class="slogan">THIS IS INDEX.JSP!!!!</p>-->
	  </div>
	</div>
	<div id="wrap">
		   <p>This table includes the information in this JSP's HTTP Request</p>
			<p>Where else does our request go? ...</p>
			<p></p>
			<!--<div class="postintro">Project 3<br />HTTP<br />Requests</div>-->
			<h2>
			  <img src="images/rosette.jpg" alt="rosette_lula_900" />
			  <br /><br />HTTP Request Parameters
			</h2>
			<table>
			  <tr>
			    <th>Remote computer making request:  </th>
			    <td><%= request.getRemoteUser() %></td>
			  </tr>
			  <tr>
			    <th>Address of remote computer:  </th>
			    <td><%= request.getRemoteAddr() %></td>
			  </tr>
			  <tr>
			    <th>HTTP method of request:</th>
			    <td><%= request.getMethod() %></td>
			  </tr>
			  <tr>
			    <th>Request URI</th>
			    <td><%= request.getRequestURI() %></td>
			  </tr>
			  <tr>
			    <th>Request URL</th>
			    <td><%= request.getRequestURL() %></td>
			  </tr>
			  <tr>
			    <th>Protocol of request:  </th>
			    <td><%= request.getProtocol() %></td>
			  </tr>
			  <tr>
			    <th>Server name:  </th>
			    <td><%= request.getServerName() %></td>
			  </tr>
			  <tr>
			    <th>Server port:  </th>
			    <td><%= request.getServerPort() %></td>
			  </tr>
			  <tr>
			    <th>Current locale of server:</th>
			    <td><%= request.getLocale() %></td>
			  </tr>
			  <tr>
			    <th>Query string:  </th>
			    <td><%= request.getQueryString() %></td>
			  </tr>
			  <tr>
			    <th>Value of parameter:  </th>
			    <td><%= request.getParameter("name") %></td>
			  </tr>
			  <tr>
			    <th>Value of request header:  </th>
			    <td><%= request.getHeader("User-Agent") %></td>
			  </tr>
			</table>
       <h2><a href="/java112/">Meg's Token Home Page</a></h2>
       </div>
  </body>
</html>
