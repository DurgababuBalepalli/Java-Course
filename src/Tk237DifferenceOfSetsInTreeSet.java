import java.util.TreeSet;

public class Tk237DifferenceOfSetsInTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		
		TreeSet<Integer> hundreds = new TreeSet<>();
		hundreds.add(9);
		hundreds.add(200);
		
		//diiference
		hundreds.removeAll(numbers);
		System.out.println(hundreds);

	}

}
