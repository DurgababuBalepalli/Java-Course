import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Tk149PutMethodInArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue<Integer> myb = new ArrayBlockingQueue<>(3);
		
		myb.put(5);
		myb.put(8);
		
		for(Object o:myb)
		{
			System.out.println(o);
		}
	}

}
