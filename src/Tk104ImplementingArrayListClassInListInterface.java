import java.util.ArrayList;
import java.util.List;

public class Tk104ImplementingArrayListClassInListInterface {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(5);
		nums.add(9);
		
		System.out.println(nums);

		//to access elements by index
		System.out.println(nums.get(1));  //gives 5
		
		//remove elements from list
		nums.remove(2);  //index no two element(i.e 9) will removed
		System.out.println(nums);
		
		
	}

}
