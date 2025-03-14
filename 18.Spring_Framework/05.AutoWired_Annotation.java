//here for car iam using annotation based configuration and for tyre iam using xml based configuration.

public class Tyre 
{
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
}

//xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
               
    <bean id = "anytyre" class = "com.durga.FirstProgram.Tyre"  >  </bean>
     	
</beans>

//car
@Component
public class Car implements Vehicle
{
	//every car needs object of tyre.so i have to create object of tyre
	private Tyre mytyre;
	
	public Tyre getMytyre() {
		return mytyre;
	}

	public void setMytyre(Tyre mytyre) {
		this.mytyre = mytyre;
	}

	public void driver()
	{
		System.out.println("durga is Driver and tyres are :"+mytyre);
	}
}

//App
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    // ApplicationContext is an interface so we should require a class(i.e ClassPathXmlApplicationContext)  to implement it.
    	
    	Tyre mytyre = (Tyre) context.getBean("anytyre");
    	System.out.println(mytyre);   //we know output : Tyre [brand=null]
    }
}

//we already know how to access annotation based configuration.Tyre using xml configuration and Car using annotation based

//Tyre
public class Tyre 
{
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "your tire is working....";
	}
	
}

//Spring.xml
<!-- you can copy paste the bean from the following link  https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s11.html -->

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
     
    <context:component-scan base-package="com.durga.FirstProgram"></context:component-scan>  <!-- to let know spring to  -->        
    <bean id = "anytyre" class = "com.durga.FirstProgram.Tyre"  >  </bean>
     	
</beans>

//Car
@Component
public class Car implements Vehicle
{
	//every car needs object of tyre.so i have to create object of tyre
	private Tyre mytyre;
	
	public Tyre getMytyre() {
		return mytyre;
	}

	public void setMytyre(Tyre mytyre) {
		this.mytyre = mytyre;
	}

	public void driver()
	{
		System.out.println("durga is Driver and tyres are :"+mytyre);
	}
}

//App
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    // ApplicationContext is an interface so we should require a class(i.e ClassPathXmlApplicationContext)  to implement it.
    	
    	Car obj = (Car) context.getBean("car");  //because i used annotation configuration for car.so i should pass class name in small letters
    	obj.driver(); //OUTPUT : durga is Driver and tyres are :null
    }
}

//we are getting tyre is null.for car tyre is a propery.so we have to go again xml and we should define what is tyre also.instead of doing all that stuff,
//we can directly use @Autowired.it calls toString method of tyre.
public class Car implements Vehicle
{
	@Autowired   //it will go to xml file and gets instance of Tyre(simply calls object of Tyre)
	private Tyre mytyre;
	
	public Tyre getMytyre() {
		return mytyre;
	}

	public void setMytyre(Tyre mytyre) {
		this.mytyre = mytyre;
	}

	public void driver()
	{
		System.out.println("durga is Driver and tyres are :"+mytyre);
	}
}

//now i don't want to use xml configuration.see i have removed bean id and values

//xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
     
    <context:component-scan base-package="com.durga.FirstProgram"></context:component-scan>  <!-- to let know spring to  -->        
     	
</beans>

//now you have to make tyre also component.you will get same output.
@Component
public class Tyre 
{
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "your tire is working....";
	}
	
}

OUTPUT : durga is Driver and tyres are :your tire is working....
