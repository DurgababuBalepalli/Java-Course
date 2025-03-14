package stringsPractice;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class Hello {

	public static void main(String[] args) throws InterruptedException 
	{
		LinkedBlockingQueue<Integer> myb = new LinkedBlockingQueue<>(5);
		
		//adding elements
		myb.add(7);
		myb.add(9);
		
		//using offer
		myb.offer(10);
		myb.offer(8);
		
		//using put    put() - Inserts an element to the blocking queue. If the queue is full, it will wait until the queue has space to insert an element.
		myb.put(11);
		myb.put(22);
		
		//accessing by iterator
		Iterator it = myb.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//remove elements
		//using remove
		myb.remove();
		
		//using poll
		myb.poll();
		
		//using take
		myb.take();   //take throws an exception.Removes and returns an element from the blocking queue. If the queue is empty, it will wait until the queue has elements to be deleted
		
		//using clear -removes everything
		myb.clear();  
		
		//other methods
		//contains(element)
		//size()
		//toArray()
		//toString() 
	}
		
}
