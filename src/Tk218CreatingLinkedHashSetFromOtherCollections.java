import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Tk218CreatingLinkedHashSetFromOtherCollections {

	public static void main(String[] args) {
		ArrayList<Integer> evens = new ArrayList<>();
		evens.add(3);
		evens.add(6);
		evens.add(9);
		evens.add(1);
		
		LinkedHashSet<Integer> nums = new LinkedHashSet<>(evens);
		nums.add(100);
		nums.add(200);
		System.out.println(nums);
	}

}
