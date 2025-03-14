import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Tk146InsertElementsInArrayBlockingQueue {

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> myb = new ArrayBlockingQueue<>(5);
		
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
