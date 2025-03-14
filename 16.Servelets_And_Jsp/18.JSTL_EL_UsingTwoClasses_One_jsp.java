//Myservlet.java
package com.durga;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		
		//now creating another class and passing data to that. i want to fetch data from jsp 
		AnotherClass obj = new AnotherClass("rgukt",127);   //iam creating object to newly created class
		
		req.setAttribute("myname", obj);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
	}
}

//AnotherClass.java
package com.durga;

public class AnotherClass 
{
	String collage;
	int id;
	
	//iam creating constructor to accept values which are coming from MyServlet
	public AnotherClass(String collage, int id) {
		super();
		this.collage = collage;
		this.id = id;
	}

	//i am generating beans here.beans are nothing but getters and setters
	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//to get string representation of those objects iam giving tostring method also
	@Override
	public String toString() {
		return "AnotherClass [collage=" + collage + ", id=" + id + "]";
	}
	
		
}

//display.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "mycustomtag" uri = "http://java.sun.com/jsp/jstl/core"  %>   <!-- the perticular out tag is belongs to some library.that library has an uri.that uri i have mentioned here use CTRL+SPACE to see other uri -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <!-- ${myname}   here iam getting the hash code.but i want data -->
        <!-- ${myname.collage}  if you write like also you will get error.property collage not found i.e javax.el.PropertyNotFoundException: Property [collage] not found on type [com.durga.AnotherClass] -->
        <!-- so we have to use beans to fetch values.beans is nothing but setters and getters. so generate setters and getters to Anotherclass -->
        ${myname.collage}  <!-- now it will work.because i have generatd beans -->
        <!--${myname} because of tostring method you can see like this AnotherClass [collage=rgukt, id=127]  -->
</body>
</html>