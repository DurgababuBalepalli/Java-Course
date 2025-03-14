import java.util.HashMap;
import java.util.WeakHashMap;

public class Tk171CreatingWeakHashMapFromOtherMaps {

	public static void main(String[] args) {
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

	}

}
