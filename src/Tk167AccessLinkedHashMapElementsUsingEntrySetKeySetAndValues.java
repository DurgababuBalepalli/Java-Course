import java.util.LinkedHashMap;

public class Tk167AccessLinkedHashMapElementsUsingEntrySetKeySetAndValues {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> evens = new LinkedHashMap<>();
		evens.put(2, "Two");
		evens.put(4, "four");
		evens.put(6, "six");
		evens.put(8, "eight");
		evens.put(10, "Ten");
		
		System.out.println(evens);
		System.out.println(evens.entrySet()); //using entry set
		System.out.println(evens.keySet());  //using keyset
		System.out.println(evens.values());  //using values

	}

}
