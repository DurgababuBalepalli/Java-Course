<%@page import = "java.util.*" %>   <!<!-- if you want to import packages -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            int a = 20;  //whatever you write in declaration tag,you will get outside of service method
        %>
        <%
            out.println("you can have mutiple scriplet tags.this is also created in service method");
        %>
        <h1>Hello World!</h1>
        <%    //whatever you mension here is belongs to service method
            out.println(5+6);
        %>
        <%= a%>  <!<!-- if you want to print something you can use expression tag.you are writing in shotway actually it is <% out.println("a"); %> -->
    </body>
</html>
