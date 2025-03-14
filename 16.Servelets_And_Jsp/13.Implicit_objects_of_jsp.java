//we know in servelets our tomcat given many objects but we have take reference of them.but jsp we have to use no need of getting reference
jsp								servelets
request                      HTTPServeletRequest
response                     HTTPServeletResponse
pagecontext					 pagecontext
out                          PrintWriter
session						 HTTPSession
application					 ServeletContext
config						 Serveletconfig

//we are writing data in one servlet and fetching from another servlet by using session,Request object and we can do same using pagecontext.
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
		pageContext.setAttribute("name", "durga");  //now i can fetch durga with the help of name
		//but the problem is the scope of this pageContext is only for this page. if you want to
		//extend scope to multiple pages you have to use session constant
		pageContext.setAttribute("name", "durga",pageContext.SESSION_SCOPE); //now the scope of this page is not only for one,for multiple.
	%>
</body>
</html>