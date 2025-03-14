import java.util.Iterator;
import java.util.TreeSet;

public class Tk229AccessTreeSetElements {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(2);
		
		Iterator it = numbers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
