//html page

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddTwo" method = "post">   //by default here get method is used
		Enter first number : <input type = "text" name = "number1"><br>
		Enter second number : <input type = "text" name = "number2"><br>
		<input type = "submit">  //if i click submit.you wont get anything because you have to specify action.i have give AddTwo.when you click submit url will be changed.there is no page with the name AddTwo.thats where servelet should used
								//http://localhost:8080/Jsp_first_project/AddTwo?number1=7&number2=6.you can see AddTwo in url and you get 404 not found error because you dont have that page.
	</form>
</body>
</html>

//servlet
package com.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Adding_servelet extends HttpServlet  //Adding_servlet is just a class.if you extends with HttpServlet that will become servlet.
{
	//in order to add numbers we should have a method.
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException    //servlet is a server component.whenver you use servlet,you have to use service method to write logic
	{                        //whenever you use service method you require two objects.those objects are already created by tomcat(so we need not use new keyword).our aim is to get reference of it
		int i = Integer.parseInt(req.getParameter("number1"));  //iam fetching value.getParameter gives string.but we want int to store in i.parseInt can convert string literal to int
		int j = Integer.parseInt(req.getParameter("number2"));
		
		int k = i+j;
		//System.out.println("result is:+k)
		//resp.getWriter().println("result is :"+k); avoid confusion write in two lines
		
		PrintWriter output = resp.getWriter(); //getwriter returns an object of printwriter.so you need to import printwriter
		output.println("result is :"+k);
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
  
</web-app>