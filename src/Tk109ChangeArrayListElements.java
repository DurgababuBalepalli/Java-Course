import java.util.ArrayList;

public class Tk109ChangeArrayListElements {

	public static void main(String[] args) {
		ArrayList<String> phones = new ArrayList<>();
		phones.add("iphone");
		phones.add("samsung");
		phones.add("realme");
		phones.add("micro");
		
		//to change perticular element in Array list we have to use set method
		phones.set(1, "Nokia");
		System.out.println(phones);
	}

}
