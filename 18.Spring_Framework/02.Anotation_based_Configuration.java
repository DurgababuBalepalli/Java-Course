//car
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
	public void driver()
	{
		System.out.println("durga is Driver");
	}
}

//bike
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	public void driver()
	{
		System.out.println("iam bike raider now.i lost my car");
	}
}

//App
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    // ApplicationContext is an interface so we should require a class(i.e ClassPathXmlApplicationContext)  to implement it.
    	Vehicle obj = (Vehicle) context.getBean("bike"); //you have to mension the classname directly.but in small letters you should write.
    	obj.driver();
    }
}

//spring.xml
<!-- you can copy paste the bean from the following link  https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s11.html -->

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
               
     <context:component-scan base-package="com.durga.FirstProgram"></context:component-scan>  <!-- to let know your spring framework that you are using annotation based configutration you have to use the tag. you have to mension where  the class is present  -->
     
</beans>

//you can see in above xml file iam not writing configuration here.