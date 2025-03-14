//MyServelet
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		
		//now i want to pass list of values.using arraylist
		List<AnotherClass> studs = Arrays.asList(new AnotherClass("rgukt",127),new AnotherClass("ramer",12),new AnotherClass("Rogil",1));  //aslist returns fixed size list
		
		req.setAttribute("our", studs); 
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
	}
}

//Anotherclass
public class AnotherClass 
{
	String collage;
	int id;
	
	//iam creating constructor to accept values which are coming from MyServlet
	public AnotherClass(String collage, int id) {
		super();
		this.collage = collage;
		this.id = id;
	}

	//i am generating beans here.beans are nothing but getters and setters
	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	//to get string representation of those objects iam giving tostring method also
	@Override
	public String toString() {
		return "AnotherClass [collage=" + collage + ", id=" + id + "]";
	} 
	
		
}

//display.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"  %>   <!-- the perticular out tag is belongs to some library.that library has an uri.that uri i have mentioned here use CTRL+SPACE to see other uri -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <!-- ${our} you will get data like this [AnotherClass [collage=rgukt, id=127], AnotherClass [collage=ramer, id=12], AnotherClass [collage=Rogil, id=1]] -->
        ${our }

        <!-- using forEach loop to get collage names -->
      <c:forEach items="${our}" var="i">
      <c:out value="${i.collage}"></c:out>
      </c:forEach>
      
</body>
</html>