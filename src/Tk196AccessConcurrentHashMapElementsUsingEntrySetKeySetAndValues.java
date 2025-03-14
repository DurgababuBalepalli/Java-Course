import java.util.concurrent.ConcurrentHashMap;

public class Tk196AccessConcurrentHashMapElementsUsingEntrySetKeySetAndValues {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		System.out.println(details);
		
		System.out.println(details.keySet());  //keyset
		System.out.println(details.values());  //values
		System.out.println(details.entrySet()); //entryset
	}

}
