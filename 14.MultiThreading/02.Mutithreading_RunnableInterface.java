class Hai implements Runnable
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
class Hola implements Runnable
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
		Runnable obj = new Hai();
		Runnable obj1 = new Hola();
		
		//obj.start();   //start method belongs to thread class.runnable doenot has start method.so we are creating a thread obj and passing our interface
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();  //start method calls run method of Thread class.so we are passing our obj to call our Hai,hola run methods
		try{ Thread.sleep(1000); } catch(Exception e) {}  //to avoid both threads reaching scheduler at a time
		t2.start();
	}
}

//you can also handle by using throws keyword to main method.run method is not supporting throw exception so try catch