import java.util.PriorityQueue;
import java.util.Queue;

public class Tk124RemovePriorityQueueElements {

	public static void main(String[] args) {
		Queue<String> fruits  = new PriorityQueue<>();
		fruits.offer("Apple");
		fruits.offer("orange");
		fruits.offer("grape");
		fruits.offer("banana");
		
		//remove and poll useful to remove elements
		fruits.remove();
		System.out.println(fruits);
		
		fruits.poll();
		System.out.println(fruits);

	}

}
