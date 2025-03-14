import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Tk153RemoveElementsLinkedBlockingQueue {

	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> myb = new LinkedBlockingQueue<>(5);
		
		myb.add(7);
		myb.add(9);
		myb.add(10);
	
		myb.add(10);
		myb.add(8);
		
		//using remove
		myb.remove();
		
		//using poll
		myb.poll();
		
		
		//using clear -removes everything
		myb.clear();  
		
		Iterator it = myb.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
