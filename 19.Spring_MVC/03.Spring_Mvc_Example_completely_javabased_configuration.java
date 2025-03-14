//place your display.jsp in webapp. if already present in it just ignore.in previous i said that  web_inf,because internal resource
//index.jsp
<html>
<body>
	<form action="add">
		Number1 : <input type="text" name="num1">
		Number2 : <input type="text" name="num2">
		<input type="submit">
	</form>
</body>
</html>

//AddController
@Controller
public class AddController 
{
	@RequestMapping("/add")
	public ModelAndView userChecking(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpServletRequest req,HttpServletResponse res)  //you can directly get parameters from index.jsp by using @Requestparam.here number1 value stored in i and number2 stored in j.
	{
		ModelAndView mv = new ModelAndView();
		
		//int i = Integer.parseInt(req.getParameter("num1"));
		//int j = Integer.parseInt(req.getParameter("num2"));
		
		AddService as = new AddService();
		int k = as.addition(i, j);
		
		mv.setViewName("display.jsp");   
		mv.addObject("k_value",k);
		return mv;
	}
}

//Addservice
public class AddService 
{
	public int addition(int i,int j)
	{
		return i+j; 
	}
}

//FirstConfig
@Configuration
@ComponentScan({"com.hero"})  //you can multiple packages here.
@EnableWebMvc   //you have to enable webmvc so iam enabling it
public class FirstConfig extends WebMvcConfigurerAdapter   //this WebMvcConfigurerAdapter class will replace dispatcher xml configuration.
{
	
}

//webconfig
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer //inorder to mension dispatcherservlet you have to extand the class
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {FirstConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {   
		
		return null;
	}

	@Override
	protected String[] getServletMappings() {    //it is your servletmapping tag
		// TODO Auto-generated method stub
		return new String[] {"/"};  //for all the requests you have to call dispatcher servlet.
	}

	
}

//display.jsp
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