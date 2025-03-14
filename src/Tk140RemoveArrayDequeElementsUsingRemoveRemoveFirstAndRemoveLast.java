import java.util.ArrayDeque;

public class Tk140RemoveArrayDequeElementsUsingRemoveRemoveFirstAndRemoveLast {

	public static void main(String[] args) {
		ArrayDeque<String> flowers = new ArrayDeque<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		flowers.remove();
		System.out.println(flowers);
		
		flowers.removeFirst();
		System.out.println(flowers);
		
		flowers.removeLast();
		System.out.println(flowers);
	}

}
