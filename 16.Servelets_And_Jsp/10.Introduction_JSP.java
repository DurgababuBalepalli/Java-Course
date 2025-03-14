//index.html

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddJsp.jsp">
		Enter first number : <input type = "text" name = "number1"><br>
		Enter second number : <input type = "text" name = "number2"><br>
		<input type = "submit">
	</form>
</body>
</html>

//AddJsp.jsp 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "blue">
		<%           //to differenciate java code and html code we use <% otherwise entire java code displayed on html page
		
		int i = Integer.parseInt(request.getParameter("number1"));  //by default parameters are provided by jsp.inservlets we are getting references but here not required. references are provided by jsp
		int j = Integer.parseInt(request.getParameter("number2"));
		
		int k = i+j;
		
		out.println("k_value :"+k);  //you don't require to create Printwriter obj. it is directly provided to you by jsp
		
		 %>
</body>
</html>