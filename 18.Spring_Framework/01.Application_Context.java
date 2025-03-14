//first add your dependency means spring

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.21</version>
	</dependency>
  </dependencies>

//car.java

public class Car 
{
	public void driver()
	{
		System.out.println("durga is Driver");
	}
}

//App.java - simply you can think it as Main method.

public class App 
{
    public static void main( String[] args )
    {
       Car mycar = new Car();   
       mycar.driver();
    }
}

//now if i want to change from car to the bike.i have to create object for bike.instead of creating objects individually to bike or a car,you can simply use interface

//Vehilce interface
public interface Vehicle 
{
	public void driver();
}

//Car
public class Car implements Vehicle
{
	public void driver()
	{
		System.out.println("durga is Driver");
	}
}

//Bike
public class Bike implements Vehicle
{
	public void driver()
	{
		System.out.println("iam bike raider now.i lost my car");
	}
}

//App.java - simply is our main method 
public class App 
{
    public static void main( String[] args )
    {
    	Vehicle myvehicle = new Car();
    	myvehicle.driver();
    }
}

//eventhough  iam here asking for car object by saying new Car(); but why even i have to create can't i get without creating.so iam using Spring Framework.
//in Spring Framework we can use either beanFacory Interface or Application Context Interface.
//Application Context Interface is superset of beanFactory. while doing enterprise applications you have to use Context Interface.


//remaining all classes are same just change

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    // ApplicationContext is an interface so we should require a class(i.e ClassPathXmlApplicationContext)  to implement it.
    	Vehicle obj = (Vehicle) context.getBean("myfavourite"); //suppose if you want to go to collage,you will not bother which vehicle it is.you can take any vehicle.whenever i ask myfavourite vehicle you should get bike.you can link by using xml.getBean is a method in ApplicationContext.getbean return an object.
    	
    	obj.driver();
    }
}

//spring.xml  //you can take any name.but create xml file where App,Vehicle,car and other classes are present.
<beans xmlns = "http://www.springframework.org/schema/beans"   
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
   
	<bean id = "myfavourite" class = "com.durga.FirstProgram.Car"  > </bean>
</beans>

<!-- beans tag is the root tag of xml.in xml the custom tags should require definition.so beans tag also has definition. -->
 <!-- you have to mention id and class.iam saying myfavourite is car -->

 //since you are injecting objects from external source.so this concept is called dependency injection.