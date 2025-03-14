import java.util.ArrayList;
import java.util.Collections;

public class Tk245FindingExtremeValues {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(1);
		numbers.add(9);
		numbers.add(2);
		
		int a = Collections.min(numbers);
		System.out.println(a);
		
		int b =Collections.max(numbers);
		System.out.println(b);
	}

}
