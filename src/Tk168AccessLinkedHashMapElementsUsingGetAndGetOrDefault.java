import java.util.LinkedHashMap;

public class Tk168AccessLinkedHashMapElementsUsingGetAndGetOrDefault {

	public static void main(String[] args) {
		//get() - Returns the value associated with the specified key. If the key is not found, it returns null.
		//getOrDefault() - Returns the value associated with the specified key. If the key is not found, it returns the specified default value.
		
		LinkedHashMap<Integer,String> evens = new LinkedHashMap<>();
		evens.put(2, "Two");
		evens.put(4, "four");
		evens.put(6, "six");
		evens.put(8, "eight");
		evens.put(10, "Ten");
		
		System.out.println(evens.get(4));
		System.out.println(evens.getOrDefault(12,"nothing")); //if i dont specify vslue to 12 it gives by default nothing
	}

}
