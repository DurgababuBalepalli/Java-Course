import java.util.HashSet;
import java.util.LinkedHashSet;

public class Tk222UnionOfSetsInLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();
		nums.add(12);
		nums.add(11);
		nums.add(13);
		nums.add(15);
		
		LinkedHashSet<Integer> evens = new LinkedHashSet<>();
		evens.add(2);
		evens.add(4);
		
		//unionof sets
		evens.addAll(nums);        
		System.out.println(evens);

	}

}
