import java.util.Iterator;
import java.util.LinkedHashSet;

public class Tk220AccessLinkedHashSetElements {

	public static void main(String[] args) {
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();
		nums.add(12);
		nums.add(11);
		nums.add(13);
		System.out.println(nums);
		
		//using iterator
		Iterator it = nums.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	
	}

}
