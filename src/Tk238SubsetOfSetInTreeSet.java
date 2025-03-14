import java.util.TreeSet;

public class Tk238SubsetOfSetInTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		
		TreeSet<Integer> hundreds = new TreeSet<>();
		hundreds.add(9);
		hundreds.add(4);
		
		//subset
		boolean b= numbers.containsAll(hundreds);
		System.out.println(b);

	}

}
