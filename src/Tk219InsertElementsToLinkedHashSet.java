import java.util.LinkedHashSet;

public class Tk219InsertElementsToLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();
		nums.add(12);
		nums.add(11);
		nums.add(13);
		System.out.println(nums);

		LinkedHashSet<Integer> Hundreds = new LinkedHashSet<>();
		Hundreds.add(100);
		Hundreds.add(200);
		Hundreds.addAll(nums);
		System.out.println(Hundreds);
	}

}
