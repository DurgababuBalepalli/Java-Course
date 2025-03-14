import java.util.ArrayList;

public class Tk108AccessArrayListElements {

	public static void main(String[] args) {
		ArrayList<String> phones = new ArrayList<>();
		phones.add("iphone");
		phones.add("samsung");
		phones.add("realme");
		phones.add("micro");
		
		//accessing element using get
		System.out.println(phones.get(2));
		System.out.println(phones.get(3));
		System.out.println(phones.get(1));
	}

}
