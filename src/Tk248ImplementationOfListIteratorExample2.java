import java.util.ArrayList;
import java.util.ListIterator;

public class Tk248ImplementationOfListIteratorExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);

		ListIterator<Integer> it = numbers.listIterator();
		it.next();  //3
		it.next();  //5
		System.out.println(it.nextIndex());  //2
		it.previous();  //5
		it.previous();  //3
		System.out.println(it.previousIndex());  //-1
		
		it.set(100);  //in place of 3, 100 will placed
		System.out.println(numbers);
		
		it.remove();  //100 will be removed
		System.out.println(numbers);
		
		
		

	}

}
