import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tk203ImplementingTreeSetClassInSetInterface {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(2);
		
		System.out.println(numbers);
		
		//using iterator
		Iterator it = numbers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
