import java.util.LinkedHashMap;

public class Tk169RemoveLinkedHashMapElements {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> evens = new LinkedHashMap<>();
		evens.put(2, "Two");
		evens.put(4, "four");
		evens.put(6, "six");
		evens.put(8, "eight");
		evens.put(10, "Ten");
		evens.put(3, "three");
		
		evens.remove(3);  //removing by single parameter
		evens.remove(10, "Ten");  //removing by Two parameter.
		
		System.out.println(evens);
	}

}
