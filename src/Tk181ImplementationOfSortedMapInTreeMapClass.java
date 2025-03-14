import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Tk181ImplementationOfSortedMapInTreeMapClass {

	public static void main(String[] args) {
		SortedMap<Integer,String> details = new TreeMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "Tuni");
		
		System.out.println(details.firstKey());
		System.out.println(details.lastKey());
		
		details.remove(2);
		System.out.println(details);
	}

}
