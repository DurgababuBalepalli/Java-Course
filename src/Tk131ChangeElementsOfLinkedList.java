import java.util.LinkedList;

public class Tk131ChangeElementsOfLinkedList {

	public static void main(String[] args) {
		LinkedList<String> flowers = new LinkedList<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		//iam setting lotus and removing jasmine there
		flowers.set(1, "lotus");
		System.out.println(flowers);

	}

}
