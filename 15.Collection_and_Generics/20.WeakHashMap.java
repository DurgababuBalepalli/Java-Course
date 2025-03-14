package stringsPractice;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.TreeMap;

public class Hello {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("---------------CreatingWeakHashMapFromOtherMaps----------------");
		//iam creating Hashmap
		HashMap<String,Integer> evens = new HashMap<>();
		String s1 = new String("One");
		Integer i1 = 1;
		evens.put(s1, i1);
		//System.out.println(evens);
		
		WeakHashMap<String,Integer> nums = new WeakHashMap<>(evens);
		String s2 = new String("Two");
		Integer i2 = 2;
		nums.put(s2, i2);
		System.out.println(nums);
		
		System.out.println("--------------------------------------------");
		
		//put() - inserts the specified key/value mapping to the map
		//putAll() - inserts all the entries from specified map to this map
		//putIfAbsent() - inserts the specified key/value mapping to the map if the specified key is not present in the map
	
		//using put
		WeakHashMap<String,Integer> evens1 = new WeakHashMap<>();
		String st1 = new String("One");
		Integer in1 = 1;
		evens1.put(st1, in1);
		
		//putifabsent.here one is already present so not insert
		String st2 = new String("One");
		Integer in2 = 2;
		evens1.putIfAbsent(st2, in2);
		System.out.println(evens1);
		
		//here Two key is not present so inserted.
		String s3 = new String("Two");
		Integer i3 = 2;
		evens1.putIfAbsent(s3, i3);
		System.out.println(evens1);
		
		//putall
		WeakHashMap<String,Integer> numbers = new WeakHashMap<>();
		String st10 = new String("Hundred");
		Integer in100 = 100;
		evens1.put(st10, in100);
		
		numbers.putAll(evens1); //iam putting all elements in numbers
		System.out.println(numbers);
		
		System.out.println(evens.entrySet()); //using entry set
		System.out.println(evens.keySet());  //using keyset
		System.out.println(evens.values());  //using values
		
		System.out.println(evens.get(s1));
		System.out.println(evens.getOrDefault("Five",0000)); //if i dont specify vslue to 12 it gives by default nothing
		
		evens.remove("One");  //removing by single parameter
		evens.remove("Two", 2);  //removing by Two parameter.
		System.out.println(evens);
	}
		
}
