//inorder to use sql in jstl you have to add mysql connector jar to eclipse
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> <!-- for mysql -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <sql:setDataSource var = "db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/student" user="root" password="2000" /> <!-- every database has driver here for mysql com.mysql.jdbc.Driver. local host url is passed,student is our database name.default user for mysql is root -->
       <sql:query var="quer" dataSource="${db}">select *from sailors </sql:query> <!-- you have to mension your sql query which you want to execute.we have to provide datasoiure in EL. -->
       
       <c:forEach items="${quer.rows}" var="dat">  <!-- rows gives you list of elements -->
     	<c:out value="${dat.sname}"></c:out> <br>
       </c:forEach>
       
       <br> <!-- now i will fetch in good format -->
       <c:forEach items="${quer.rows}" var="i">
       <c:out value="${i.sid }"></c:out> : <c:out value="${i.sname }"></c:out> : <c:out value="${i.rating}"></c:out> <br>
       </c:forEach>
</body>
</html>