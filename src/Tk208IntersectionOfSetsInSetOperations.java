import java.util.HashSet;

public class Tk208IntersectionOfSetsInSetOperations {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(3);
		
		HashSet<Integer> evens = new HashSet<>();
		evens.add(1);
		evens.add(3);
		
		//intersection of Sets
		evens.retainAll(numbers);
		System.out.println(evens);

	}

}
