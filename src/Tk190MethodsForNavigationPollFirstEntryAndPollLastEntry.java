import java.util.TreeMap;

public class Tk190MethodsForNavigationPollFirstEntryAndPollLastEntry {

	public static void main(String[] args) {
		TreeMap<Integer,String> details = new TreeMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "Tuni");
		details.put(9, "Ramer");
		details.put(3, "99080");
		details.put(7, "hello");

		details.pollFirstEntry();
		System.out.println(details);
		
		details.pollLastEntry();
		System.out.println(details);
	}

}
