import java.util.ArrayList;
import java.util.Collections;

public class Tk243AlgorithmsSearchingUsingBinarySearch {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(1);
		numbers.add(9);
		numbers.add(2);

		Collections.sort(numbers);  //before binarySearch we have to sort.
		int position = Collections.binarySearch(numbers, 8);
		System.out.println(position);
	}

}
