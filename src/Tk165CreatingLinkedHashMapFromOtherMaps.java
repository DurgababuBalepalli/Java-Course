import java.util.LinkedHashMap;

public class Tk165CreatingLinkedHashMapFromOtherMaps {

	public static void main(String[] args) {
		//creating linked hash map
		LinkedHashMap<Integer,String> evens = new LinkedHashMap<>();
		evens.put(2, "Two");
		evens.put(4, "four");
		evens.put(6, "six");
		
		//creating LinkedHashMap from another LinkedHashmap(i.e evens).
		LinkedHashMap<Integer,String> numbers = new LinkedHashMap<>(evens);
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		
		System.out.println(numbers);
	}

}
