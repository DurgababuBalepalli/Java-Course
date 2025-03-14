import java.util.ArrayDeque;
import java.util.Iterator;

public class Tk141IteratingArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<String> flowers = new ArrayDeque<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		//ascending order
		Iterator it = flowers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//descending order
		Iterator it1 = flowers.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
	}

}
