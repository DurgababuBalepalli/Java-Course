import java.util.SortedSet;
import java.util.TreeSet;

public class Tk228InsertElementsToTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(2);
		System.out.println(numbers);
		
		TreeSet<Integer> tens = new TreeSet<>();
		tens.add(10);
		tens.add(20);
		
		tens.addAll(numbers);
		System.out.println(tens);
	}

}
