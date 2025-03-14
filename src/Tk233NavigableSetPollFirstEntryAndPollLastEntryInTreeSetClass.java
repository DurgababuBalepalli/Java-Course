import java.util.TreeSet;

public class Tk233NavigableSetPollFirstEntryAndPollLastEntryInTreeSetClass {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(2);
		
		numbers.pollFirst();
		System.out.println(numbers);
		
		numbers.pollLast();
		System.out.println(numbers);

	}

}
