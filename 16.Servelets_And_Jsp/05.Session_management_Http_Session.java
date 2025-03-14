//index.html

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddTwo">
		Enter first number : <input type = "text" name = "number1"><br>
		Enter second number : <input type = "text" name = "number2"><br>
		<input type = "submit">
	</form>
</body>
</html>

//Adding_servlet

package com.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Adding_servelet extends HttpServlet  
{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException  
	{
		int i = Integer.parseInt(req.getParameter("number1"));  
		int j = Integer.parseInt(req.getParameter("number2"));
		
		int k = i+j;
		
		HttpSession mysession = req.getSession();  //iam getting a session
		mysession.setAttribute("k_value", k);
		
		resp.sendRedirect("squaring");
	}
}

//square servlet
package com.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square_servlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession mysession = req.getSession();
		
		
		int k = (int) mysession.getAttribute("k_value");  //there i have used set.here get attribute.
		int square = k*k;
		
		PrintWriter output = res.getWriter();
		output.println("square is: "+square);
		
		//output.println("servlet 2 accessed");
	}
}

//web.xml

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  
  <servlet>
  	<servlet-name>myfirst_servlet</servlet-name>
  	<servlet-class>com.Servelets.Adding_servelet</servlet-class>  
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>myfirst_servlet</servlet-name>
  	<url-pattern>/AddTwo</url-pattern>
  </servlet-mapping>
  
  <servlet>
  	<servlet-name>mysecond_servlet</servlet-name>
  	<servlet-class>com.Servelets.Square_servlet</servlet-class>  
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>mysecond_servlet</servlet-name>
  	<url-pattern>/squaring</url-pattern>
  </servlet-mapping>
  
</web-app>
