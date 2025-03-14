//home.jsp

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="details">
		<input type="text" name="myname" ><br>
		<input type="text" name="myid"><br>
		<input type="submit"><br>
	</form>
</body>
</html>

//MyServelt.java

package com.durga;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/details")   //iam using anotation based configuration
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		String name = req.getParameter("myname");
		int id = Integer.parseInt(req.getParameter("myid"));  //generally it is allowing even if i type myid is a negative number.
		//if i give negative id it should not allow me to servlet.so iam  using filter.
		//create filter in the MyServlet package.
		
		PrintWriter pr = res.getWriter();
		pr.println(name);
	}
}

//idfilter.java - your filter class
package com.durga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/details")   //whenever i call details,from jsp it will come idfilter.
public class IdFilter implements Filter {
	
	public void destroy() {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//doFilter almost same ad doGet, or DoPost.it will accept the request.
		PrintWriter pr = response.getWriter();
		
		HttpServletRequest myreq = (HttpServletRequest)request;  //iam converting(Typecasting) servlet request to httpServlet request
		int id = Integer.parseInt(myreq.getParameter("myid"));   //you have to specify where the filter should work.
		
		if(id>1)
		{
			chain.doFilter(request, response);  //to calling nextfilter.if you don't have next filter you have to call the servlet.here iam calling servlet.
		}
		else
		{
			pr.println("your id input is negative number.so invalid");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException{
		
	}

}

