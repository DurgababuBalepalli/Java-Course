import java.util.PriorityQueue;
import java.util.Queue;

public class Tk122InsertElementsToPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> fruits  = new PriorityQueue<>();
		fruits.offer("Apple");
		fruits.offer("orange");
		fruits.offer("grape");
		fruits.offer("banana");
		
		//you can also use add()
		fruits.add("dragonfruit");
		
		System.out.println(fruits);
		
		System.out.println(fruits.peek());  //to access first inserted element
		
		//to remove elements
		fruits.poll();   
		System.out.println(fruits);

	}

}
