//lets say iam taking some tyre class and iam using xml based configuration

package com.durga.FirstProgram;

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
               
    <bean id = "anytyre" class = "com.durga.FirstProgram.Tyre"  > </bean>
     
</beans>

//main
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    // ApplicationContext is an interface so we should require a class(i.e ClassPathXmlApplicationContext)  to implement it.
    	
    	Tyre mytyre = (Tyre) context.getBean("anytyre");
    	System.out.println(mytyre);   //your output is Tyre [brand=null]
    }
}

//now my aim is to set value to bean. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container
//simply i want to set value from main to tyre class.you need to understand that brand is dependency for your tyre class
//just you have to write one line in your xml file

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
               
    <bean id = "anytyre" class = "com.durga.FirstProgram.Tyre"  > 
    	<property name="brand" value="MRF"></property>  <!-- by using bean property you can set value -->
    </bean>
     	
</beans>
