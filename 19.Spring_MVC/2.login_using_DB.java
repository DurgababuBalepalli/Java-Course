//index.jsp

<html>
<body>
	<form action="login">
		Username : <input type="text" name="user">
		PassWord : <input type="text" name="pass">
		<input type="submit">
	</form>
</body>
</html>

//web.xml
<web-app>
  <display-name>Archetype Created Web Application</display-name>
  
  <servlet>
  	<servlet-name>first</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>first</servlet-name>
  	<url-pattern>/</url-pattern>
  </servlet-mapping>
</web-app>

//login controller
@Controller
public class LoginController 
{
	@RequestMapping("/login")
	public ModelAndView userChecking(HttpServletRequest req,HttpServletResponse res)
	{
		ModelAndView mv = new ModelAndView();
		
		String uname = req.getParameter("user");
		String password = req.getParameter("pass");
		
		if(uname.equals("durga") && password.equals("1234"))
		{
			mv.setViewName("display.jsp");  //if my username and password is coreect,then iam calling dispaly.jsp page
		}
		else
		{
			mv.setViewName("index.jsp");   //if mycredentials wrong iam calling again index.jsp page.
		}
		return mv;
	}
}

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

//display.jsp
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

//but here my intension is i want to connect with database and i have to check credentials from service class
