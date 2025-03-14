import java.util.LinkedHashSet;

public class Tk221RemoveElementsFromLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();
		nums.add(12);
		nums.add(11);
		nums.add(13);
		nums.add(15);
		
		nums.remove(11);  //removing an element
		System.out.println(nums);
		
		nums.removeAll(nums);  //removing all elements
		System.out.println(nums);

	}

}
