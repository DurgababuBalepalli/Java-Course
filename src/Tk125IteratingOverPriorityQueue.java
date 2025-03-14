import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Tk125IteratingOverPriorityQueue {

	public static void main(String[] args) {
		Queue<String> fruits  = new PriorityQueue<>();
		fruits.offer("Apple");
		fruits.offer("orange");
		fruits.offer("grape");
		fruits.offer("banana");
		
		Iterator it = fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
