import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Tk154PutMethodInLinkedBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue<Integer> myb = new LinkedBlockingQueue<>(3);
		
		myb.put(5);
		myb.put(8);
		
		for(Object o:myb)
		{
			System.out.println(o);
		}

	}

}
