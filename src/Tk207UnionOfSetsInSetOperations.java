import java.util.HashSet;

public class Tk207UnionOfSetsInSetOperations {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(3);
		
		HashSet<Integer> evens = new HashSet<>();
		evens.add(2);
		evens.add(4);
		
		//unionof sets
		evens.addAll(numbers);        
		System.out.println(evens);
	}

}
