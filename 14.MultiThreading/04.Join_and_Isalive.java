public class Hello
{
	public static void main(String[] args) throws InterruptedException
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
		
		System.out.println(t1.isAlive());  //isalive useful to know whether the thread is alive or not.
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");
	}
}