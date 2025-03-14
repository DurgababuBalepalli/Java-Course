import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Tk121ImplementingPriorityQueueClassInQueueInterface {

	public static void main(String[] args) {
		Queue<String> fruits  = new PriorityQueue<>();
		fruits.offer("Apple");
		fruits.offer("orange");
		fruits.offer("grape");
		fruits.offer("banana");
		
		System.out.println(fruits);
		
		System.out.println(fruits.peek());  //to access first inserted element
		
		//to remove elements
		fruits.poll();   
		System.out.println(fruits);
		fruits.poll(); 
		System.out.println(fruits);

	}

}
