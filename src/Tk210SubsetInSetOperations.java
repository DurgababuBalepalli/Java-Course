import java.util.HashSet;

public class Tk210SubsetInSetOperations {

	public static void main(String[] args) {
		//To check if a set is a subset of another set or not, we can use the containsAll() method
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(3);
		
		HashSet<Integer> evens = new HashSet<>();
		evens.add(1);
		evens.add(3);

		boolean b = numbers.containsAll(evens);  //if evens are subset to numbers it will give true.
		System.out.println(b);
	}

}
