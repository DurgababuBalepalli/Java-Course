//display.jsp -run this file directly on server

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="myfun" %> <!-- iam importing functions here -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <!-- if you want to do some operations like string comparision,equal,length etc.you can jstl inbuilt functions.for that you have to import -->
       <c:set var="mystr" value="iam durgababu iam employee"></c:set> <!-- set useful to set some value -->
       ${myfun:length(mystr) }  <!-- gives length of string. -->
       
       <!-- now i want to split the string based on space.so i will use forEach -->
       <c:forEach items="${myfun:split(mystr, ' ') }" var="i"> <!-- iam spliting the string based on space -->
       ${i} <br>
       </c:forEach>
       
       <br>
       <!-- now iam spliting based on a -->
       <c:forEach items="${myfun:split(mystr,'a') }" var="j">
       ${j }
       </c:forEach>
       
       <br>
       ${myfun:indexOf(mystr,'yee') } <!-- you can ask index of perticular substring. -->
       
       <br>
       ${myfun:contains(mystr,'babu') } <!-- checks whether perticular substring exist or not.here true -->
       ${myfun:contains(mystr,'roar') } <!-- here false -->
       
       <br>
       <!-- you can use contains function using if -->
       <c:if test="${myfun:contains(mystr,'babu') }">
       yes your string is found
       </c:if>
       
       <br>
       <!-- you can also check whether  string is ends with perticular substring or not -->
       <c:if test="${myfun:endsWith(mystr,'employee') }">
       yes endswith the same
       </c:if>
       
       <br>
       ${myfun:toUpperCase(mystr) }
</body>
</html>