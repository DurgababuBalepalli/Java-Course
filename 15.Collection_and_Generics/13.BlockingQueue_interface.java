import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Tk145ImplementationOfBlockingQueueInArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> myb = new ArrayBlockingQueue<>(3);
		myb.add(6);
		myb.take();
		
		myb.put(5);
		myb.put(8);
		
		for(Object o:myb)
		{
			System.out.println(o);
		}

	}

}
