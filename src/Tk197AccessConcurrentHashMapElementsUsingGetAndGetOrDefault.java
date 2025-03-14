import java.util.concurrent.ConcurrentHashMap;

public class Tk197AccessConcurrentHashMapElementsUsingGetAndGetOrDefault {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		System.out.println(details);
		
		System.out.println(details.get(5));  //using get
		System.out.println(details.getOrDefault(3, "your asked element not present"));  //if place 8,related data(i.e 79957214) gives.
	}

}
