import java.util.concurrent.ConcurrentHashMap;

public class Tk198RemoveConcurrentHashMapElements {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		System.out.println(details);
		
		String removed = details.remove(8);
		System.out.println(removed);
		System.out.println(details.keySet());
		
		boolean b = details.remove(1, "N160127");
		System.out.println(details);

	}

}
