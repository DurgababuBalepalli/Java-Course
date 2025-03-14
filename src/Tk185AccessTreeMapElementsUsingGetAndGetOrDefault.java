import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Tk185AccessTreeMapElementsUsingGetAndGetOrDefault {

	public static void main(String[] args) {

		TreeMap<Integer,String> evens = new TreeMap<>();
		evens.put(2, "Two");
		evens.put(4, "four");
		evens.put(6, "six");
		evens.put(8, "eight");
		evens.put(10, "Ten");
		
		System.out.println(evens.get(4));
		System.out.println(evens.getOrDefault(12,"nothing"));

	}

}
