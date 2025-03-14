import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Tk194CreatingConcurrentHashMapFromOtherMaps {

	public static void main(String[] args) {
		HashMap<Integer,String> details = new HashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		
		ConcurrentHashMap<Integer,String> data = new ConcurrentHashMap<>(details);
		//data.putAll(details); you can use put method.or you can directly pass here ConcurrentHashMap<>();
		data.put(2, "Tuni");
		data.put(9, "Ramer");

		System.out.println(data);
	}

}
