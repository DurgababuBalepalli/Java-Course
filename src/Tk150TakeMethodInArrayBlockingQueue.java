import java.util.concurrent.ArrayBlockingQueue;

public class Tk150TakeMethodInArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
ArrayBlockingQueue<Integer> myb = new ArrayBlockingQueue<>(3);
		
		myb.put(5);
		myb.put(8);
		myb.take();		
		for(Object o:myb)
		{
			System.out.println(o);
		}

	}

}
