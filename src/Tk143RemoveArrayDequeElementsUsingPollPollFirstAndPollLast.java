import java.util.ArrayDeque;

public class Tk143RemoveArrayDequeElementsUsingPollPollFirstAndPollLast {

	public static void main(String[] args) {
		ArrayDeque<String> flowers = new ArrayDeque<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		flowers.poll();
		System.out.println(flowers);
		
		flowers.pollFirst();
		System.out.println(flowers);
		
		flowers.pollLast();
		System.out.println(flowers);

	}

}
