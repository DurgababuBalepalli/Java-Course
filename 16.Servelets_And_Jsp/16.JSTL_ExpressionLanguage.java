//myServlet class

package hello;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String name = "durgababu";
		
		req.setAttribute("myname", name);    //name will go to jsp file. you can have session object,pageobject etc.
		RequestDispatcher second = req.getRequestDispatcher("display.jsp");  
		second.forward(req, res);
		
	}
}

//display.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- this is first way -->
	<%
		String mine = request.getAttribute("myname").toString();  //this will return obj.so iam converting to String
		out.println(mine);
	%>
	
	<!-- using Expression language -->
	${myname}
</body>
</html>