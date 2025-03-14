import java.util.HashMap;
import java.util.WeakHashMap;

public class Tk173AccessWeakHashMapElementsUsingEntrySetKeySetAndValues {

	public static void main(String[] args) {
		WeakHashMap<String,Integer> evens = new WeakHashMap<>();
		String s1 = new String("One");
		Integer i1 = 1;
		evens.put(s1, i1);
		
		String s2 = new String("Two");
		Integer i2 = 2;
		evens.put(s2, i2);
		System.out.println(evens);
		
		System.out.println(evens);
		System.out.println(evens.entrySet()); //using entry set
		System.out.println(evens.keySet());  //using keyset
		System.out.println(evens.values());  //using values

	}

}
