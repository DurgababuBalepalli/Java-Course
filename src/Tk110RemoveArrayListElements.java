import java.util.ArrayList;

public class Tk110RemoveArrayListElements {

	public static void main(String[] args) {
		ArrayList<String> phones = new ArrayList<>();
		phones.add("iphone");
		phones.add("samsung");
		phones.add("realme");
		phones.add("micro");
		
		phones.remove(1);  //by using index you can remove
		System.out.println(phones);
		
		phones.remove("realme"); //by using object also you can remove
		System.out.println(phones);

	}

}
