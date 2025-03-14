import java.util.LinkedList;

public class Tk128CreatingLinkedList {

	public static void main(String[] args) {
		LinkedList<String> flowers = new LinkedList<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		System.out.println(flowers);
		
		//add at perticular position
		flowers.add(1, "lotus");
		System.out.println(flowers);
	}

}
