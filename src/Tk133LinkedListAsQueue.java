import java.util.LinkedList;
import java.util.Queue;

public class Tk133LinkedListAsQueue {

	public static void main(String[] args) {
		Queue<String> flowers = new LinkedList<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		//using queue methods
		flowers.offer("lotus");
		System.out.println(flowers);
		
		String s = flowers.peek();
		System.out.println(s);
		System.out.println(flowers);
		
		String s1 = flowers.poll();
		System.out.println(s1);
		System.out.println(flowers);
	}

}
