import java.util.TreeSet;

public class Tk230RemoveTreeSetElements {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(2);

		numbers.remove(4);
		System.out.println(numbers);
		
		numbers.removeAll(numbers);
		System.out.println(numbers);
	}

}
