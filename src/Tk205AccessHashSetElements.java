import java.util.HashSet;
import java.util.Iterator;

public class Tk205AccessHashSetElements {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(3);
		
		//using iterator
		Iterator it = numbers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}		
	}

}
