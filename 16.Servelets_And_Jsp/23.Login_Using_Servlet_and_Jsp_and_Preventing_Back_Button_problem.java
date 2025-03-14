//login.jsp

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="loginpage" method = "post"> <!-- login servlet using Post. -->
		Enter Username : <input type="text" name="user"> <br>
		Enter Password : <input type="password" name="pass"><br>
		<input type="submit">
	</form>
</body>
</html>

//loginServlet

package com.durga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginpage")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  //iam sending data to server.so doPost is recommended.
	{
		
		//PrintWriter pr = response.getWriter();
		
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		//iam have to verify the username and the password is correct or not
		if(name.equals("durgababu") && pass.equals("1234"))
		{
			//you can directly access welcome page by url.but i don't want anyone can access welcome page without login.
			//so i will maintain a session
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			
			response.sendRedirect("welcome.jsp");  //if username and password is correct, i have to redirect to welcome page.
		}
		else
		{
			//pr.println("your password is wrong"); //you can display message or you can redirect login page again.
			response.sendRedirect("login.jsp");   //if username and password is Incorrect,iam saying show login page again.
		}
	}
}

//welcome.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	//webbrowser maintain cache to access websites as quick as possible.so after you click logout also,if you click back button again shows secured 
	//welcom page.so i don't want that thing. whatever you want mension to the browser(for ex: iam saying to browser hey don't cache the files) should placed in the headers.
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //works Http 1.1 //browser is client.so the server saying donot save the page."Cache-Control" is to control cache, "no-cache, no-store, must-revalidate" instruction understand by browser.we have byhot
	
	response.setHeader("Pragma", "no-cache");  //older versions http 1.0
	
	response.setHeader("Expires", "0");  //for proxy  servers
	//i don't want directly anyone access welcome page with the url.so by using session object,iam checking whether user is login or not.
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
	
	%>
	<h1>Welcome ${username}</h1> <!-- i want to show username in welcome page.so iam using EL -->
	
	<a href="videos.jsp">click here for videos</a>  <!-- iam sending for vidoes -->
	
	<form action="Logout">   <!-- iam creating logout button.once you click on it,it should call logout servlet. -->
		<input type="submit" value="logout">
	</form>
</body>
</html>

//videos.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");  //same backbutton problem.so here also writing
	
	//i don't want directly anyone access videos page with the url.so by using session object,iam checking whether user is login or not.
	//iam maintaning the same session.
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
	
	%>
	
	<!-- iam pasting embeded code of video.so you can directly watch this video on your website. -->
	<iframe width="560" height="315" src="https://www.youtube.com/embed/kZXv5uO9kO0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>

//logout servlet(i.e logout.java)
package com.durga;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//whenever you click on logout button,seesion attribute should removed and all data should be cleared.
		HttpSession session  = request.getSession();
		session.removeAttribute("username");
		session.invalidate(); //removes all the data
		
		response.sendRedirect("login.jsp");  //from logout iam sending again to the login page.
	}


}

//about us - nothing wrote here.emi rayaledhu
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- login.jsp and aboutus.jsp pages are not secure pages.because to view aboutus page doesnot require to login -->
</body>
</html>