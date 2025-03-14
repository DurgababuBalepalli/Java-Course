import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Tk195InsertElementsToConcurrentHashMap {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");

		details.putIfAbsent(2, "wastefellow");  //using putifabsent
		
		ConcurrentHashMap<Integer,String> data = new ConcurrentHashMap<>();  
		data.put(3, "tuni");
		
		data.putAll(details);  //using putall
		System.out.println(data);
	}

}
