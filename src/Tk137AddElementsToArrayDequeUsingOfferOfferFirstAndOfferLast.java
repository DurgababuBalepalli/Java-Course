import java.util.ArrayDeque;
import java.util.LinkedList;

public class Tk137AddElementsToArrayDequeUsingOfferOfferFirstAndOfferLast {

	public static void main(String[] args) {
		ArrayDeque<String> flowers = new ArrayDeque<>();
		
		flowers.offer("rose");
		
		flowers.offerFirst("cat");
		
		flowers.offerLast("apple");
		
		System.out.println(flowers);
	}

}
