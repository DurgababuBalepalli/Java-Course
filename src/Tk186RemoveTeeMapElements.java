import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Tk186RemoveTeeMapElements {

	public static void main(String[] args) {
		TreeMap<Integer,String> evens = new TreeMap<>();
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
