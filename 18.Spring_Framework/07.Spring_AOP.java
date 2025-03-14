// we know this 

@Component
public class Ramer 
{
	public void show()
	{
		//you will write business logic here. 
		
		System.out.println("hey......this is good software company");
	}
}

//AppConfig
@Configuration    
@ComponentScan(basePackages = "com.durga.FirstProgram")  
public class AppConfig 
{
	
}

//App - main  method
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  
    	
    	Ramer obj = context.getBean(Ramer.class);   
    	obj.show();
    }
}

//in show method you may have only the show method.you also write different methods.
//in order to protect business logic you have to write security methods...you have to maintain log files..you have to write transaction.log files,trasactions and security all these are called cross cutting concerns.
//In computing, a log file is a file that records either events that occur in an operating system or other software runs, or messages between different users of communication software
//the problem is if you write all these stuff here...it is difficult identify bugs while testing.so iam taking a separate class to these things.lets say helper class

public class Helper 
{
	public void log()
	{
		System.out.println("show method is called");
	}
}

//even if i take all the stuff to seperate file,i have to call these methods in show method see
	public void show()
	{
		log();    //i don't want to mention here.automatically called these type of methods whenever i ask show() method.

		//you will write business logic here. 
		
		System.out.println("hey......this is good software company");
	}

//to call automatically iam using AOP - Aspect oriented programming.Aop supports OOP.to use AOP you have to add jarfiles
	<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.9.1</version>
    <scope>runtime</scope>
	</dependency>
	
	<dependency>
    <groupId>aopalliance</groupId>
    <artifactId>aopalliance</artifactId>
    <version>1.0</version>
	</dependency>
	
	<dependency>
    <groupId>aspectj</groupId>
    <artifactId>aspectjrt</artifactId>
    <version>1.5.4</version>
	</dependency>
//for cross cutting concerns we have to keep that class as @Aspect. because it is automatically called.but @Aspect only cannot work
//you have to remember some moreterms.
//Advice - when you call Show what should be called.when i call show method of Ramer i should call log method of Helper class.we have two in advice Before,After.
		   //Before calls log method before the show method.
//pointcut - defines where you have to call.simply you have to mension pointcut inside Before or After.

//now modify helper class

@Component   //because we are using spring framework.so we have to make this  class also @component
@Aspect
@EnableAspectJAutoProxy			//bydefault AOP is not enabled in your system.so you have to enable whenever you require
public class Helper 
{
	@Before("execution(public void show())")   //pointcut is execution(public void show()).you are mensioning inside advice 
	public void log()
	{
		System.out.println("show method is called");
	}
}

//output
show method is called
hey......this is good software company

