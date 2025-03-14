import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Tk152AccessElementsLinkedBlockingQueue {

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> myb = new ArrayBlockingQueue<>(5);
		
		myb.add(7);
		myb.add(9);
		
		myb.add(10);
		myb.add(8);
		
		Iterator it = myb.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
