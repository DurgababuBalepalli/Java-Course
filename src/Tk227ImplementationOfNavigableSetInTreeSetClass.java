import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tk227ImplementationOfNavigableSetInTreeSetClass {

	public static void main(String[] args) {
		NavigableSet<Integer> details = new TreeSet<>();
		details.add(5);
		details.add(1);
		details.add(8);
		details.add(2);
		details.add(9);
		details.add(3);
		details.add(7);
		
		System.out.println(details.first());
		System.out.println(details.last());
		
		System.out.println(details.pollFirst());
		System.out.println(details);
		
		System.out.println(details.pollLast());
		System.out.println(details);
	}

}
