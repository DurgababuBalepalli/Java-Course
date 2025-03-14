//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  
  <servlet>
  	<servlet-name>hello</servlet-name>
  	<servlet-class>com.Servlets.Myservlet</servlet-class>	
  </servlet>
  
  <servlet-mapping>
    <servlet-name>hello</servlet-name>
    <url-pattern></url-pattern>  <!-- i dont have any html page so iam not specifying -->
  </servlet-mapping>
  
  <context-param>
  	<param-name>Name</param-name>           <!-- name and phone no are my intial parameters -->
  	<param-value>durga</param-value>
  </context-param>
  
  <context-param>
  	<param-name>phoneNo</param-name>          
  	<param-value>7995721404</param-value>
  </context-param>
  
</web-app> 

<!-- Remember run from myservlet .java -->

//Myservlet.java
package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
  {
    //now i want to get name and phone no here
    ServletContext mycontext = getServletContext();  //getServletContext() is to access servletcontext. tomcat gives you object of servletcontext
    String myname = mycontext.getInitParameter("Name");  //getInitParameter() gives value of an attribute Name
    
    PrintWriter output = res.getWriter();
    output.println(myname);
  }
}
