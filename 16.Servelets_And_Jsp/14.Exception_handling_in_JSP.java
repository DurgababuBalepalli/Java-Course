generally we can handle exceptions in jsp like this

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.*,java.util.Random"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		try
		{
			int d = 10/0;	
		}
		catch(Exception e)
		{
			out.println("error :"+e.getMessage());
		}
	%>
</body>
</html>

//but this is not right.always we want errors in separate page with baground red.the common way is maintining all errors in one page.
//so iam creating another page error.jsp
//first lets check error page is accessing or not

//home.jsp - our main page
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage = "error.jsp" %>  <!-- we have special attribute error page.if any problem occur in this page,this attribute errorPage take us to error.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int d = 10/0;  
	%>
</body>
</html>

//error.jsp - our error page
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hey you got error.
</body>
</html>

//you will get "hey you got error".if you want error page in red color just change body bgcolor.
//the main thing is the page error.jsp should know itself iam an error page. so you have to write isErrorPage="true" in error.jsp

//home.jsp

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage = "error.jsp" %>  <!-- we have special attribute error page.if any problem occur in this page,this attribute errorPage take us to error.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int d = 10/0;  
	%>
</body>
</html>

//error.jsp

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage = "true" %> <!-- iam giving isErrorPage="true because a page should know itself as an error page -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "red">
hey you got error.
		<%= exception.getMessage() %>  <!--exception is an object only works in exception page so we have to make this page as exception page by using isErrorPage = "true" -->
</body>								 
</html>
