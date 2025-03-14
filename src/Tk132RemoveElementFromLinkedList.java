import java.util.LinkedList;

public class Tk132RemoveElementFromLinkedList {

	public static void main(String[] args) {
		LinkedList<String> flowers = new LinkedList<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		flowers.remove(1);
		flowers.poll();  //first element will be removed
		
		System.out.println(flowers);
		

	}

}
