import java.util.ArrayDeque;
import java.util.LinkedList;

public class Tk136AddElementsToArrayDequeUsingAddAddFirstAndAddLast {

	public static void main(String[] args) {
		ArrayDeque<String> flowers = new ArrayDeque<>();
		flowers.add("rose");
		
		flowers.addFirst("gulab");
		
		flowers.addLast("orange");
		
		System.out.println(flowers);

	}

}
