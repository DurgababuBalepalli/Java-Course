IN DIRECTIVE TAG we have 3 types 
    1.@page - to import modules
    	Syntax : <%@page Attribute = "Value",Attribute = "Value",..... %> 
    	we have different attributes
    	A)import = "importList"  //we can use to import modules
    	B)language = "scripting language"  //Scripting language is JSP,by default we are using java to convert.
    	C)extends = "className"
    	4)session = "True | false"  //if you want sessions you can use true otherwise make it false
    	5)autoFlush = "true | false"  //to make your buffer not full
    	6)contentType = "contentinfo"
    	7)errorpage = "error-url"
    	8)iserrorpage = "true | false"
    	9)info = "information"
    	10)isELIgnored = "true | false"   //EL - ExpressionLanguage
    	11)isThreadSafe = "true | false"

    2.@include - if you want to use outside jsp page in your jsp page then you should use it
    	<%@include file = "theFileWhichEverYouWanttoImportToCurrentFile.jsp" %>
    3.@taglib - if you want other tags ratherthan html you can use it.for example you want use spring framework tages in your html
    	<%@ taglib uri = "uri" prefix = "preffered" %>  //external tages present inside in one library.that library has uri.so you have to specify that.											//if you define own tag.you have to use <preffered:durga> //you can use any prefix hello etc.


//program to understand
header.jsp(1st jsp file)
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
    	out.println("hello home.jsp importing header.jsp");
    %>
</body>
</html>

//home.jsp(secondjspfile)
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.*,java.util.Random"%>  <!-- here you can multiple directive attributes content type etc.. -->
<%@include file = "header.jsp" %> <!--same syntax should follow dont change file as myfile or etc. you are importing header.jsp file to home.jsp  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>