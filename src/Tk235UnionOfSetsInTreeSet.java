import java.util.TreeSet;

public class Tk235UnionOfSetsInTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		
		TreeSet<Integer> hundreds = new TreeSet<>();
		hundreds.add(100);
		hundreds.add(200);
		
		//union
		hundreds.addAll(numbers);
		System.out.println(hundreds);

	}

}
