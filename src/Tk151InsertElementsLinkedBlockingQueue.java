import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Tk151InsertElementsLinkedBlockingQueue {

	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> myb = new LinkedBlockingQueue<>(5);
		
		myb.add(7);
		myb.add(9);
		
		//using offer
		myb.offer(10);
		myb.offer(8);
		
		for(Object o:myb)
		{
			System.out.println(o);
		}

	}

}
