import java.util.ArrayDeque;

public class Tk144ArrayDequeAsStack {

	public static void main(String[] args) {
		ArrayDeque<String> flowers = new ArrayDeque<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		System.out.println(flowers.peek());
		
		flowers.pop();
		System.out.println(flowers);

	}

}
