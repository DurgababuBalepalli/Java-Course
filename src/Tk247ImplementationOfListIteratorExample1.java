import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Tk247ImplementationOfListIteratorExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);

		ListIterator<Integer> it = numbers.listIterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.previous());
		
		System.out.println("--------------FORWARD ORDER-------------------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------BACKWARD ORDER-------------------");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}
