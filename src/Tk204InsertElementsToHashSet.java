import java.util.HashSet;
//add() - inserts the specified element to the set
//addAll() - inserts all the elements of the specified collection to the set
public class Tk204InsertElementsToHashSet {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>(10);
		numbers.add(10);
		numbers.add(15);
		numbers.add(18);
		numbers.add(25);
		numbers.add(16);
		System.out.println(numbers);
		
		HashSet<Integer> evens = new HashSet<>();
		evens.add(2);
		evens.add(4);
		
		evens.addAll(numbers);        //using addall
		System.out.println(evens);
	}

}
