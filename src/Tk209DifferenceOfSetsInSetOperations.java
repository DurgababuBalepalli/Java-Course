import java.util.HashSet;

public class Tk209DifferenceOfSetsInSetOperations {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(3);
		
		HashSet<Integer> evens = new HashSet<>();
		evens.add(1);
		evens.add(4);
		
		//difference operation between 2 sets
		numbers.removeAll(evens);
		System.out.println(numbers);
	}

}
