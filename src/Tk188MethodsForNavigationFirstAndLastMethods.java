import java.util.NavigableMap;
import java.util.TreeMap;

public class Tk188MethodsForNavigationFirstAndLastMethods {

	public static void main(String[] args) {
		TreeMap<Integer,String> details = new TreeMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "Tuni");
		details.put(9, "Ramer");
		details.put(3, "99080");
		details.put(7, "hello");
		
		System.out.println(details.firstEntry());
		System.out.println(details.lastEntry());
		System.out.println(details.pollFirstEntry());
		System.out.println(details.pollLastEntry());
		
		System.out.println(details);

	}

}
