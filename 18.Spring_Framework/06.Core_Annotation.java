//Samsung
public class Samsung 
{
	public void specifications()
	{
		System.out.println("6gb,octacore,48mp CAM");
	}
}

//main
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  //you can have multiple configuration files.
    	Samsung obj = context.getBean(Samsung.class);   //in spring framework we have to use dependency injection concept.so i want samsung object.
    	obj.specifications();
    }
}

//configuration class. instead of using xml for configuration we are using class now. 

@Configuration    //for configuration class we have to use @configuration annotation.
public class AppConfig 
{
	@Bean    //you have to specify to the method as Bean.because it is returning Object.
	public Samsung gettingPhone()
	{
		return new Samsung();
	}
}

//if you want one more object,in xml file we have to create one more like this
<bean>
	<bean id = "phone" class = "Samsung">
	<bean id = "cpu" class = "Snapdragon">  //Snapdragon is another class.you can ask cpu from xml if you use xml.but i don't want to use it anymore.i want to go with annotation based
</bean>

//iam taking mobile and processor beans and iam just executing.just for idea read it.

//Samsung
public class Samsung 
{
	
	public void specifications()
	{
		System.out.println("6gb,octacore,48mp CAM");
	}	
}

//MobileProcessor - iam taking mobile processor interface 
public interface MobileProcessor 
{
	public void processor();
}

//Sanpdragon - i will override mobile processor Interface
public class Snapdragon implements MobileProcessor 
{
	@Bean                      //iam taking another bean.so our first bean is phone,second bean is processor.
	public void processor() 
	{
		System.out.println("Gaming Processor....");
	}
}

//AppConfig  - configuration class

@Configuration    //for configuration class we have to use @configuration annotation.
public class AppConfig 
{
	@Bean    //you have to specify to the method as Bean.because it is returning Object.
	public Samsung gettingPhone()
	{
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor gettingProcessor()
	{
		return new Snapdragon();
		
	}
}

//main method
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  //for annotation based configuration we should use AnnotationAnnotationConfigApplicationContext() class.but in previous we have passed to xml file.but now we have to create a class and we have to config
    																			//here iam taking Appconfig class and from there iam returning an object.so instead of xml iam using class
    	
    	Samsung obj = context.getBean(Samsung.class);   //in spring framework we have to use dependency injection concept.so i want samsung object.
    	Snapdragon obj1 = context.getBean(Snapdragon.class);
    	obj1.processor();
    	obj.specifications();
    }
}

output:
Gaming Processor....
6gb,octacore,48mp CAM

//now myintesion is calling processor from samsung Class. because samsung phone has processor.so you just need to do small changes
//remove annotation @Bean to Snapdragon class 
public class Snapdragon implements MobileProcessor 
{
	
	public void processor() 
	{
		System.out.println("Gaming Processor....");
	}
}

//add AutoWire to Mobileproessor in Samsung class and getters and setters

public class Samsung 
{
	@Autowired  //goes to appconfiguration and checks the return type.there we are getting Snapdragon object(i.e new Snapdragon())
	MobileProcessor myprocessor;  //MobileProcessor myprocessor = new Snapdragon(); i can use like this.but myrequirement is not using new Keyword.so iam using AppConfig class to get Object ofSnapDragon.

	public MobileProcessor getMyprocessor() {
		return myprocessor;
	}

	public void setMyprocessor(MobileProcessor myprocessor) {
		this.myprocessor = myprocessor;
	}
	
	public void specifications()
	{
		myprocessor.processor();
		System.out.println("6gb,octacore,48mp CAM");
	}
	
}

//change main method
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  //for annotation based configuration we should use AnnotationAnnotationConfigApplicationContext() class.but in previous we have passed to xml file.but now we have to create a class and we have to config
    																			//here iam taking Appconfig class and from there iam returning an object.so instead of xml iam using class
    	
    	Samsung obj = context.getBean(Samsung.class);   //in spring framework we have to use dependency injection concept.so i want samsung object.
    	obj.specifications();
    }
}

//overall process -  from main method you are calling samsung object.in samsung class Specification method calling snapdragon class's prcessor method'

--------------------------------------------------------------------------------------------------------------------------------
//we know @Bean is replacement for <bean> tag in xml.can i write without specifying the beans...yes we can.
/* see i want to remove below mensioned stuff.
public class AppConfig 
{
	@Bean    //you have to specify to the method as Bean.because it is returning Object.
	public Samsung gettingPhone()
	{
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor gettingProcessor()
	{
		return new Snapdragon();
		
	}
} */

//what ever classes you want objects just make them component.in our example we have two classes and i want those objects.so make them Component.
//Samsung
@Component  
public class Samsung 
{
	@Autowired  
	MobileProcessor myprocessor;  
	public MobileProcessor getMyprocessor() {
		return myprocessor;
	}

	public void setMyprocessor(MobileProcessor myprocessor) {
		this.myprocessor = myprocessor;
	}
	
	public void specifications()
	{
		myprocessor.processor();
		System.out.println("6gb,octacore,48mp CAM");
	}
	
}

//snapdragon

@Component
public class Snapdragon implements MobileProcessor 
{
	
	public void processor() 
	{
		System.out.println("Gaming Processor....");
	}
}

//add componentscan to configuration class remove stuff inside it.
@Configuration    
@ComponentScan(basePackages = "com.durga.FirstProgram")  //it will scan all components for you.you have to mension basepackage means where all these classes are present.if you have multiple packages just separate by comma and write here.ex :com.durga.hello,com.babu.hai.
public class AppConfig 
{
	
}

//remaining classes are Same no need to modify

//inxml we have class name but what is Component name.
//by default if you say @Component for Samsung class it will be @Component("samsung").try the program by making this change.it works  //class present in small letters.
//ofcourse if you want you can change name like @Component("mySamsung")
//if you write @Component we call it as Nonqualified and Decapitalized
//we know @ComponentScan takes all components by type.what if we have two processors.there is confusion araise,which component should take.
//we will get error No qualifying bean of type 'com.durga.FirstProgram.MobileProcessor' available: expected single matching bean but found 2: mediaTek,snapdragon
//so inorder to remove this confusion you can give @Privamary annotation to the perticular class.for example if i give primary to Mediatek mediateck processor will be prited.if i give primary to snapdragon that will come

//iam just creating MediaTek processor and implementing with same interface.

@Component
@Primary   //iam giving primary to mediatek so mediatek printed
public class MediaTek implements MobileProcessor {

	public void processor() {
		System.out.println("good for normal use");
	}

}

output : 
good for normal use
6gb,octacore,48mp CAM

//if you want to mension at autowiredAnnotation you can use @Qualifier. and donot mension Primary to any class

@Component  
public class Samsung 
{
	@Autowired  
	@Qualifier("mediaTek")
	MobileProcessor myprocessor;  
	public MobileProcessor getMyprocessor() {
		return myprocessor;
	}

	public void setMyprocessor(MobileProcessor myprocessor) {
		this.myprocessor = myprocessor;
	}
	
	public void specifications()
	{
		myprocessor.processor();
		System.out.println("6gb,octacore,48mp CAM");
	}
	
}