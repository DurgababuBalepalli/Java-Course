//index.jsp

<html>
<body>
<h2>Hello World!</h2>
<form action="addition">
	USERNAME : <input type = "text" name="username"> <br>
	PASSWORD : <input type = "password" name="pass"> <br>
	<input type="submit"> 
</form>

</body>
</html>

//web.xml

<web-app>
  <servlet>
  	<servlet-name>first</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>  <!-- iam using dispatcher servlet -->
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>first</servlet-name>
  	<url-pattern>/</url-pattern>  <!-- / means iam saying that for all requests should call by dispatcher servlet only -->
  </servlet-mapping>
</web-app>

<!-- dispatcher servlet is not a part of tom cat server.so in order to use that we have to import some libraries 1.spring-context 2.spring-webmvc 3.mysql-connector-java 4.JSTL-->

	<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.21</version>
	</dependency>
	
	<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.21</version>
	</dependency>

//Dispatcher servlet needs to send request to some class.so iam just creating a class.
//AdditionController or you can say Addition Servlet.

@Controller
public class AddController 
{
	@RequestMapping("/add")    //whenever i click submit button this method will be called
	public String addition()
	{
		return "display.jsp";
	}
}

//you need to teach Dispatcher Servlet to hey dispatcher call the Addition controller.for that purpose iam creating another xml file
//but your xml file name should be {something}-servlet.xml for ex: durga-servlet.xml  simply something is serveletname which is present in //web.xml

//first-servlet.xml
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:ctx="http://www.springframework.org/schema/context"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:mvc="http://www.springframework.org/schema/mvc"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
	http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
	http://www.springframework.org/schema/mvc
	http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd
	http://www.springframework.org/schema/context
	http://www.springframework.org/schema/context/spring-context-2.5.xsd ">
	
 	<ctx:annotation-config></ctx:annotation-config>
 	<ctx:component-scan base-package="com.hero"></ctx:component-scan>  <!-- scans all components(here we can say controllers) -->
</beans>

//we know controller has some message.but if dispatcherServlet calls controller,the result will be printed on IDE.but i want result in a Page.so for that purpose iam creating one more page display.jsp iam just print hello here only.later i will print addition of numbers.
//display.jsp

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	helloooooooooooo
</body>
</html>

NOTE : create class in src/main/java. maybe this /java path not found.then go to src/main and create java folder.then create class
with package com.durga or anything.

//here myintension is not to get hellooo only i want to get addition of two numbers.

//AddController
@Controller
public class AddController 
{
	@RequestMapping("/add")    //whenever i click submit button this method will be called
	public ModelAndView addition(HttpServletRequest request,HttpServletResponse response)   //we are returning ModelViewObject. 
	{
		int i = Integer.parseInt(request.getParameter("one"));
		int j = Integer.parseInt(request.getParameter("two"));
		
		int k = i+j;   //inorder to send value of k you have to use model object
		ModelAndView mvobj = new ModelAndView();  //model and view is a class
		mvobj.setViewName("display.jsp");   //you have to mention which view you want to call.i want to call display.jsp
		mvobj.addObject("k_value",k);    //what data you want to pass.k_value is label k is our value.
		
		return mvobj;
	}
}

//display.jsp
<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%=
		request.getAttribute("k_value")
	%>
</body>
</html>

//Using EL(Expression language to print result). for that just change display.jsp only
<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>  <!-- isELIgnored = "false" iam adding this line because bydefault EL is not enabled -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${k_value}
</body>
</html>


//basically In N-tire architecture we have seen that service class.insted of doing calculation in controller, lets give that work to Service class.make you sure that your service class present in some other package.
//crete a service class and add i+j there and return

//our service class

public class AddService 
{
	public int addition(int i,int j)
	{
		return i+j;
	}
}

//AddController

@Controller
public class AddController 
{
	@RequestMapping("/add")    //whenever i click submit button this method will be called
	public ModelAndView addition(HttpServletRequest request,HttpServletResponse response)   //we are returning ModelViewObject. 
	{
		int i = Integer.parseInt(request.getParameter("one"));
		int j = Integer.parseInt(request.getParameter("two"));
		
		AddService as = new AddService();  //you have to create object of service class
		int k = as.addition(i, j);
		
		ModelAndView mvobj = new ModelAndView();  //model and view is a class
		mvobj.setViewName("display.jsp");   //you have to mention which view you want to call.i want to call display.jsp
		mvobj.addObject("k_value",k);    //what data you want to pass.k_value is label k is our value.
		
		return mvobj;
	}
}

//using @Request parameter
@Controller
public class LoginController 
{
	@RequestMapping("/add")
	public ModelAndView userChecking(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpServletRequest req,HttpServletResponse res)  //you can directly get parameters from index.jsp by using @Requestparam.here number1 value stored in i and number2 stored in j.
	{
		ModelAndView mv = new ModelAndView();
		
		//int i = Integer.parseInt(req.getParameter("num1"));    //you need not use whenever you use @Requestparam
		//int j = Integer.parseInt(req.getParameter("num2"));
		
		AddService as = new AddService();
		int k = as.addition(i, j);
		
		mv.setViewName("display.jsp");
		mv.addObject("k_value",k);
		return mv;
	}
}

//using java configuration
//i don't want to use web.xml(to call dispatcher servlet) and first-servlet.xml(which  is useful to dispatcher servelt, to say which controller it take) files anymore. i want completely go with annotation configuration.
//delete web.xml and first-servlet.xml after creation of configuration classes

//FirstConfig

@Configuration
@ComponentScan({"com.hero"})  //you can multiple packages here.
public class FirstConfig 
{
	
}

//WebConfig
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer //inorder to mension dispatcherservlet you have to extand the class
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {   //it is your <servlet> tag
		// TODO Auto-generated method stub
		return new Class[] {FirstConfig.class};   //you have to mension firstConfig class
	}

	@Override
	protected String[] getServletMappings() {    //it is your servletmapping tag
		// TODO Auto-generated method stub
		return new String[] {"/"};  //for all the requests you have to call dispatcher servlet.
	}

	
}

//in AddController we are saying display.jsp. but this is  not correct way.because in future if you move to jsf you need to change extension
//mvobj.setViewName("display.jsp");  i don't want to mension like this
//first we have to move display.jsp ,to the folder Web.Inf. because we need to hide the file. somewhere you have to mension .jsp or .jsp
//so you have to use internalViewResolver class to do that


@Configuration
@ComponentScan({"com.hero"})  //you can multiple packages here.
public class FirstConfig 
{
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver irv = new InternalResourceViewResolver();
		irv.setPrefix("/WEB-INF/");  //you have to mension where display.jsp present
		irv.setSuffix(".jsp");  //you have to mesion extension of page.
		
		
		return irv;
	}
}

//instead of mensioning display.jsp just place display
@Controller
public class AddController 
{
	@RequestMapping("/add")
	public ModelAndView userChecking(HttpServletRequest req,HttpServletResponse res)  //you can directly get parameters from index.jsp by using @Requestparam.here number1 value stored in i and number2 stored in j.
	{
		ModelAndView mv = new ModelAndView();
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		AddService as = new AddService();
		int k = as.addition(i, j);
		
		mv.setViewName("display");   //here iam not mensioning .jsp file extension.internalviewresolver will gives you bean to specify which type of file and where it is present
		mv.addObject("k_value",k);
		return mv;
	}
}

//see the program 3.how we can use completely annotation based configuration.