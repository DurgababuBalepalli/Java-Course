//instaead of using xml we can simply use annotations.

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

//AddServlet

package com.durga;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddTwo")
public class AddServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException  
	{
		int i = Integer.parseInt(req.getParameter("number1"));  
		int j = Integer.parseInt(req.getParameter("number2"));
		
		int k = i+j;
		
		req.setAttribute("k_value", k); //iam passing k value to square_servelet.you have to fetch with the name k_value
		
		//i have two options to call second_servlet(i.e Square_servlet) 1.request dispatcher 2.redirect.iam using 1st one
		RequestDispatcher second_servlet = req.getRequestDispatcher("squaring");  //the argument is like AddTwo
		second_servlet.forward(req, resp);  //you have to forward request and responce object.you have to get again
		
	}
}

//SquareServelet

package com.durga;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/squaring")
public class SquareServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int k = (int)req.getAttribute("k_value");  //get attribute gives object.so object can't converted to int.so type cast
		int square = k*k;
		
		PrintWriter output = res.getWriter();
		output.println("square is: "+square);
	}
}

//we dont require web.xml