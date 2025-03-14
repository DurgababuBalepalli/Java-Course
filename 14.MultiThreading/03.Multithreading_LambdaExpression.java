//using lambda expression
//first iam using annonymous class then i will use lambda expression
/*class Hai implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hai");
			try { Thread.sleep(2000); } catch(Exception e) {};   
			
		}
	}
}
class Hola implements Runnable
{
	public void run()      
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
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();  
		try{ Thread.sleep(1000); } catch(Exception e) {}  
		t2.start();
	}
}*/

//annonymous class
/*
class Hola implements Runnable
{
	
}
public class Hello
{
	public static void main(String[] args)
	{
		Runnable obj = new Runnable()
						{
							public void run()
							{
								for(int i=0;i<5;i++)
								{
									System.out.println("hai");
									try { Thread.sleep(2000); } catch(Exception e) {};   
									
								}
							}
						};
						
		Runnable obj1 = new Runnable()
						{
							public void run()      
							{
								for(int i=0;i<5;i++)
								{
									System.out.println("Hello");
									try{ Thread.sleep(2000); } catch(Exception e) {}
								}
							}
						};
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();  
		try{ Thread.sleep(1000); } catch(Exception e) {}  
		t2.start();
	}
} */

//now iam applying lambda expression
/*
public class Hello
{
	public static void main(String[] args)
	{
		Runnable obj = () ->
					   {
						   for(int i=0;i<5;i++)
						   {
								System.out.println("hai");
								try { Thread.sleep(2000); } catch(Exception e) {};   
									
							}
						};
						
		Runnable obj1 = ()->      
						{
							for(int i=0;i<5;i++)
							{
								System.out.println("Hello");
								try{ Thread.sleep(2000); } catch(Exception e) {}
							}
						};
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();  
		try{ Thread.sleep(1000); } catch(Exception e) {}  
		t2.start();
	}
} */

//we are just using obj and obj1 once.so in place of obj1 pasted lambda expressioned code.and in place of obj1
public class Hello
{
	public static void main(String[] args)
	{
		
		Thread t1 = new Thread(() ->
					   {
						   for(int i=0;i<5;i++)
						   {
								System.out.println("hai");
								try { Thread.sleep(2000); } catch(Exception e) {};   
									
							}
						});
		Thread t2 = new Thread(()->      
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello");
				try{ Thread.sleep(2000); } catch(Exception e) {}
			}
		});
		
		t1.start();  
		try{ Thread.sleep(1000); } catch(Exception e) {}  
		t2.start();
	}
}