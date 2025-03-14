import java.util.concurrent.atomic.AtomicInteger;

//inconsistent values are not useful.so threads should work properly.so thread safety is important
//thread safety acheived by 2 ways.one is synchronized,second is AtomicInteger

//using synchronized
/*
class Counter
{
	int count;
	public synchronized void count_meth()
	{
		count++;
	}
}
public class Hello
{
	public static void main(String[] args) throws InterruptedException 
	{
		Counter obj = new Counter();
		
		Thread t1 = new Thread(() ->                               //you can directly write Thread t1 = new Thread(new Runnable)
				   {
						for(int i=0;i<500;i++)
						{
							obj.count_meth();
						}
				   });
		Thread t2 = new Thread(() ->
					{
						for(int i=0;i<500;i++)
						{
							obj.count_meth();
						}
					});
		
		t1.start();
		t2.start();
		
		t1.join();  //if you didn't give then t1 will busy with counting but main will executed before t1.so let finish t1,then execute at last.
		t2.join();
		
		System.out.println("main_executes :"+obj.count);   //now you will get 1000
		
	}
} */

//2nd way - atomicInteger
class Counter
{
	AtomicInteger count = new AtomicInteger();
	public  void count_meth()
	{
		count.incrementAndGet();
	}
}
public class Hello
{
	public static void main(String[] args) throws InterruptedException 
	{
		Counter obj = new Counter();
		
		Thread t1 = new Thread(() ->                               //you can directly write Thread t1 = new Thread(new Runnable)
				   {
						for(int i=0;i<500;i++)
						{
							obj.count_meth();
						}
				   });
		Thread t2 = new Thread(() ->
					{
						for(int i=0;i<500;i++)
						{
							obj.count_meth();
						}
					});
		
		t1.start();
		t2.start();
		
		t1.join();  
		t2.join();
		
		System.out.println("main_executes :"+obj.count);   //now you will get 1000
		
	}
}