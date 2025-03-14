import java.util.ArrayList;
import java.util.Iterator;

public class Tk246ImplementationOfIterator {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(1);
		numbers.add(9);
		numbers.add(2);
		
		Iterator it = numbers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
