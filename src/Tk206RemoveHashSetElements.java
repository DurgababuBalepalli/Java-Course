import java.util.HashSet;
//remove() - removes the specified element from the set
//removeAll() - removes all the elements from the set
public class Tk206RemoveHashSetElements {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(3);

		numbers.remove(1);  //removing an element
		System.out.println(numbers);
		
		numbers.removeAll(numbers);  //removing all elements
		System.out.println(numbers);
	}

}
