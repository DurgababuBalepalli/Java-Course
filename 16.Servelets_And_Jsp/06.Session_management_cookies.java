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

//Adding servelet

package com.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		
		Cookie mycookie = new Cookie("k_value", k+"");  //cookie accepts value in string format.Cookie is class. by adding  +"" you will get string format
		resp.addCookie(mycookie);
		
		resp.sendRedirect("squaring");
	}
}

//square servelet
package com.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square_servlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int k = 0;
		
		Cookie mycookiesarray[] = req.getCookies();  //we have getcookies so we will get all cockies,you can choose which cookie you want
		
		for(Cookie i:mycookiesarray)
		{
			
			if(i.getName().equals("k_value"))  //getname(),equals are methods.
			{
				k = Integer.parseInt(i.getValue());  //getvalue return string.so
			}
		}
		
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