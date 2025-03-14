import java.util.ArrayList;
import java.util.Collections;

//frequency() - returns the count of the number of times an element is present in the collection
//disjoint() - if two sets not have common elements then they are said to be disjoint.

public class Tk244AlgorithmsComposition {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(2);
		numbers.add(9);
		numbers.add(2);

		int twos = Collections.frequency(numbers, 2);
		System.out.println(twos);
		
		ArrayList<Integer> odds = new ArrayList<>();
		odds.add(3);
		odds.add(5);
		odds.add(7);
		
		boolean b = Collections.disjoint(numbers, odds);
		System.out.println(b);
	}

}
