import java.util.PriorityQueue;
import java.util.Queue;

public class Tk123AccessPriorityQueueElements {

	public static void main(String[] args) {
		Queue<String> fruits  = new PriorityQueue<>();
		fruits.offer("Apple");
		fruits.offer("orange");
		fruits.offer("grape");
		fruits.offer("banana");
		
		//first way
		System.out.println(fruits);

		//2nd way
		for(Object fr : fruits)
		{
			System.out.println(fr);
		}
	}

}
