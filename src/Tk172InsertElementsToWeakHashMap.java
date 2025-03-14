import java.util.HashMap;
import java.util.WeakHashMap;

public class Tk172InsertElementsToWeakHashMap {

	public static void main(String[] args) {
		
		//put() - inserts the specified key/value mapping to the map
		//putAll() - inserts all the entries from specified map to this map
		//putIfAbsent() - inserts the specified key/value mapping to the map if the specified key is not present in the map
	
		//using put
		WeakHashMap<String,Integer> evens = new WeakHashMap<>();
		String s1 = new String("One");
		Integer i1 = 1;
		evens.put(s1, i1);
		
		//putifabsent.here one is already present so not insert
		String s2 = new String("One");
		Integer i2 = 2;
		evens.putIfAbsent(s2, i2);
		System.out.println(evens);
		
		//here Two key is not present so inserted.
		String s3 = new String("Two");
		Integer i3 = 2;
		evens.putIfAbsent(s3, i3);
		System.out.println(evens);
		
		//putall
		WeakHashMap<String,Integer> numbers = new WeakHashMap<>();
		String s10 = new String("Hundred");
		Integer i100 = 100;
		evens.put(s10, i100);
		
		numbers.putAll(evens); //iam putting all elements in numbers
		System.out.println(numbers);

	}

}
