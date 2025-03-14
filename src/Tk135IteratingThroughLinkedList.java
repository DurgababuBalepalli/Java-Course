import java.util.LinkedList;

public class Tk135IteratingThroughLinkedList {

	public static void main(String[] args) {
		LinkedList<String> flowers = new LinkedList<>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("sunflower");
		
		for(String str:flowers)
		{
			System.out.println(str);
		}
		
	}

}
