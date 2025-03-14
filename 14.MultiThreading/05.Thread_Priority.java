//the first way to give name to the thread
/*public class Hello
{
	public static void main(String[] args) throws InterruptedException 
	{
						
		Thread t1 = new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hai");
				try{ Thread.sleep(1000); }catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("hola");
				try{ Thread.sleep(1000); } catch(Exception e) {}
			}
		});
		
		System.out.println(t1.getName());   //to get name of thread
		
		
		t1.setName("first thread");
		t2.setName("second thread");
		
		System.out.println(t1.getName());
		
		t1.start();
		Thread.sleep(10);
		t2.start();
	}
} */

//the secondway to setname to the thread
public class Hello
{
	public static void main(String[] args) throws InterruptedException 
	{
						
		Thread t1 = new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hai "+Thread.currentThread().getPriority());
				try{ Thread.sleep(1000); }catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("hola");
				try{ Thread.sleep(1000); } catch(Exception e) {}
			}
		});
		
		//t1.setPriority(1);
		//t2.setPriority(10);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
		System.out.println(t1.getPriority()); 
		System.out.println(t2.getPriority());
		
		t1.start();
		Thread.sleep(10);
		t2.start();
	}
}