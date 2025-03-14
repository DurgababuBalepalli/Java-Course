import java.util.WeakHashMap;

public class Tk175RemoveWeakHashMapElements {

	public static void main(String[] args) {
		WeakHashMap<String,Integer> evens = new WeakHashMap<>();
		String s1 = new String("One");
		Integer i1 = 1;
		evens.put(s1, i1);
		
		String s2 = new String("Two");
		Integer i2 = 2;
		evens.put(s2, i2);
		System.out.println(evens);
		
		evens.remove("One");  //removing by single parameter
		evens.remove("Two", 2);  //removing by Two parameter.
		System.out.println(evens);
	}

}
