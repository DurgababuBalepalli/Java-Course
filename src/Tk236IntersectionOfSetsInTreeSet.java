import java.util.TreeSet;

public class Tk236IntersectionOfSetsInTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		
		TreeSet<Integer> hundreds = new TreeSet<>();
		hundreds.add(4);
		hundreds.add(200);
		
		//intersection
		hundreds.retainAll(numbers);
		System.out.println(hundreds);

	}

}
