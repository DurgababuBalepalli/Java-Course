//myservlet.java
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
		String name = "durga";
		
		req.setAttribute("myname", name);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
		
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
        <mycustomtag:out value="${myname}"></mycustomtag:out>    <!--out tag is useful to print output.but this out tag belongs to JSTL.so iam including using taglib-->
        <mycustomtag:import url="file:///C:/Users/Durgababu/Pictures/lekhini/%E0%B0%B2%E0%B1%87%E0%B0%96%E0%B0%BF%E0%B0%A8%E0%B0%BF%20(Lekhini)%20%E2%80%94%20Type%20in%20Telugu.html/"></mycustomtag:import>  <!-- to import other website in your project.here i have given local url.you can give http://www.greeks.com etc. -->
         
        

        
</body>
</html>