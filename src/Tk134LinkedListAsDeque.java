import java.util.Deque;
import java.util.LinkedList;

public class Tk134LinkedListAsDeque {

	public static void main(String[] args) {
		Deque<String> flowers = new LinkedList<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		flowers.add("lotus");
		System.out.println(flowers);
		
		flowers.addFirst("Almond");
		System.out.println(flowers);
		
		flowers.addLast("apple");
		System.out.println(flowers);
		
		flowers.removeFirst();
		System.out.println(flowers);
		
		flowers.removeLast();
		System.out.println(flowers);

	}

}
