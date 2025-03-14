//if you use getters and setters, to set values to beans that  is called setters injection.in previous program we have used setters to set value.recall it once we have also used property tag to set value.
//this is not only way to set values.we can also use constructors.if we use constructors to set values that is called constructor injection

public class Tyre 
{
	private String brand;

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
}

//Spring Xml file
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
               
    <bean id = "anytyre" class = "com.durga.FirstProgram.Tyre"  > 
    	<constructor-arg value="MRF"></constructor-arg>  <!-- iam using constructor to pass value -->
    </bean>
     	
</beans>

//main method.
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    // ApplicationContext is an interface so we should require a class(i.e ClassPathXmlApplicationContext)  to implement it.
    	
    	Tyre mytyre = (Tyre) context.getBean("anytyre");
    	System.out.println(mytyre);
    }
}
