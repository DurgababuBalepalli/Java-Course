import java.util.LinkedHashSet;

public class Tk224DifferenceOfSetsInLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();
		nums.add(12);
		nums.add(11);
		nums.add(13);
		nums.add(15);
		
		LinkedHashSet<Integer> evens = new LinkedHashSet<>();
		evens.add(13);
		evens.add(4);
		
		//diffrence of sets
		nums.removeAll(evens);        
		System.out.println(nums);

	}

}
