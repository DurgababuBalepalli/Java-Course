/*
class Counter
{
	int count;
	public void count_meth()
	{
		count++;
	}
}
public class Hello
{
	public static void main(String[] args) throws InterruptedException 
	{
		Counter obj = new Counter();
		obj.count_meth();
	    obj.count_meth();   //if you want to call another time.now you will get 2.
	    
		System.out.println(obj.count);
		
	}
} */

//if i want to count 1000 times.instead of using main thread iam using a separate thread for count1000 times
/*
class Counter
{
	int count;
	public void count_meth()
	{
		count++;
	}
}
public class Hello
{
	public static void main(String[] args) throws InterruptedException 
	{
		Counter obj = new Counter();
		
		Runnable obj1 = () ->
					   {
							for(int i=0;i<500;i++)
							{
								obj.count_meth();
							}
					   };
		
		Thread t1 = new Thread(obj1);
		t1.start();
		
		t1.join();  //if you didn't give then t1 will busy with counting but main will executed before t1.so let finish t1,then execute at last.
		
		System.out.println("main_executes :"+obj.count);   //now you will get 500
		
	}
}
*/

//now letme take another thread to count 500 times
/*
class Counter
{
	int count;
	public void count_meth()
	{
		count++;
	}
}
public class Hello
{
	public static void main(String[] args) throws InterruptedException 
	{
		Counter obj = new Counter();
		
		Runnable obj1 = () ->                               //you can directly write Thread t1 = new Thread(new Runnable)
					   {
							for(int i=0;i<500;i++)
							{
								obj.count_meth();
							}
					   };
		Runnable obj2 = () ->
						{
							for(int i=0;i<500;i++)
							{
								obj.count_meth();
							}
						};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();  //if you didn't give then t1 will busy with counting but main will executed before t1.so let finish t1,then execute at last.
		t2.join();
		
		System.out.println("main_executes :"+obj.count);   //now you will get 500
		
	}
} */

//here the problem started.while t1 is busy with addition,t2 taking count value.so both threads will get same value.so you won't get 1000.you will get
//random number 534,850 etc.so by specifying synchronize keyword,you are saying that hey t2 wait until t1 complete it's operation.
//so simply sinchronized useful to get coordination among the threads.
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
		
		Runnable obj1 = () ->                               //you can directly write Thread t1 = new Thread(new Runnable)
					   {
							for(int i=0;i<500;i++)
							{
								obj.count_meth();
							}
					   };
		Runnable obj2 = () ->
						{
							for(int i=0;i<500;i++)
							{
								obj.count_meth();
							}
						};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();  //if you didn't give then t1 will busy with counting but main will executed before t1.so let finish t1,then execute at last.
		t2.join();
		
		System.out.println("main_executes :"+obj.count);   //now you will get 1000
		
	}
}

//you can directly pass obj of Runnable class to thread.see annonymous classes if you don't understand it
/*
Thread t1 = new Thread((new Runnable)
			{
				public void run()
				{
					for(int i=0;i<500;i++)
					{
						obj.count_meth();
					}
				}
			});
*/