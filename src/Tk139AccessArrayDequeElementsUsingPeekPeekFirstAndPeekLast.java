import java.util.ArrayDeque;

public class Tk139AccessArrayDequeElementsUsingPeekPeekFirstAndPeekLast {

	public static void main(String[] args) {
		ArrayDeque<String> flowers = new ArrayDeque<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		System.out.println(flowers.peek());
		System.out.println(flowers.peekFirst());
		System.out.println(flowers.peekLast());

	}

}
