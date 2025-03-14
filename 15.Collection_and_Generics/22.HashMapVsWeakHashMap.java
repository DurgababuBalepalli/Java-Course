import java.util.HashMap;
import java.util.WeakHashMap;

public class Tk170HashMapVsWeakHashMap {

	public static void main(String[] args) {
		//creating weakHashMap
		WeakHashMap<String,Integer> evens = new WeakHashMap<>();
		String s1 = new String("first");
		String s2 = new String("second");
		
		Integer i1 = 2;
		Integer i2 = 4;
		
		evens.put(s1, i1);
		evens.put(s2, i2);
		System.out.println(evens);
		
		//iam making reeference as null
		s1 = null;
	
		//iam calling garbage collector to collect unneccessary things
		System.gc();
		System.out.println(evens);   //weak reference s1 will removed
		
		System.out.println("------------------------same with HashMap---------------------------");
		
		//hashmap creates strong references to Keys.so key will not removed
		HashMap<String,Integer> evens1 = new HashMap<>();
		String s3 = new String("THREE");
		String s4 = new String("FOUR");
		
		Integer i3 = 2;
		Integer i4 = 4;
		
		evens1.put(s3, i3);
		evens1.put(s4, i4);
		System.out.println(evens1);
		
		//iam making reeference as null
		s3 = null;
	
		//iam calling garbage collector to collect unneccessary things
		System.gc();
		System.out.println(evens1);   //weak reference s3 won't removed
	}

}
