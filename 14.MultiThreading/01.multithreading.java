class Hai extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hai");
			try { Thread.sleep(2000); } catch(Exception e) {};   //we will get checked exception intrupted exception.so use try catch
			
		}
	}
}
class Hola extends Thread
{
	public void run()      //internally we have run method in Thread class
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try{ Thread.sleep(2000); } catch(Exception e) {}
		}
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Hai obj = new Hai();
		Hola obj1 = new Hola();
		
		obj.start();   //start method calls run() method.
		try{ Thread.sleep(1000); } catch(Exception e) {}  //to avoid both threads reaching scheduler at a time
		obj1.start();
	}
}

//you can also handle by using throws keyword to main method.run method is not supporting throw exception so try catch