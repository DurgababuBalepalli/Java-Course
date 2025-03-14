import java.util.ArrayList;
import java.util.Collections;

public class Tk240AlgorithmsSorting {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(1);
		numbers.add(9);
		numbers.add(2);
		
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
	}

}
