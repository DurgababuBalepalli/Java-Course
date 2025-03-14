import java.util.SortedSet;
import java.util.TreeSet;

public class Tk226ImplementationOfSortedSetInTreeSetClass {

	public static void main(String[] args) {
		SortedSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(2);
		
		System.out.println(numbers);
		
		System.out.println(numbers.first()); //gives first element.
		System.out.println(numbers.last());  //gives last element
		
		numbers.remove(9);  //removes element 9
		System.out.println(numbers);
 	}

}
