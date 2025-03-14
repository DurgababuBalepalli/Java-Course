import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Tk148RemoveElementsInArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
ArrayBlockingQueue<Integer> myb = new ArrayBlockingQueue<>(5);
		
		myb.add(7);
		myb.add(9);
		myb.add(10);
	
		myb.add(10);
		myb.add(8);
		
		//using remove
		myb.remove();
		
		//using poll
		myb.poll();
		
		//using take
		myb.take();
		
		//using clear -removes everything
		myb.clear();  
		
		Iterator it = myb.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
