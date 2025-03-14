import java.util.ArrayDeque;

public class Tk142RemoveArrayDequeElementsUsingClear {

	public static void main(String[] args) {
		ArrayDeque<String> flowers = new ArrayDeque<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		flowers.clear();
		System.out.println(flowers);

	}

}
