import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tk158CreateHashMap {

	public static void main(String[] args) {
			Map<String,String> details = new HashMap<>();
			details.put("name", "durgababu");
			details.put("id", "N160127");
			details.put("phoneno", "79957214");
			details.put("address", "Tuni");

			System.out.println(details);
			
			//hashmap not following the order.but treemap follows ascending order
			Map<Integer,String> details1 = new HashMap<>();
			details1.put(1, "red");
			details1.put(56, "blue");
			details1.put(3, "green");
			details1.put(2, "grey");
			details1.put(5,"yellow");
			details1.put(23, "white");
			details1.put(12, "red");
			details1.put(13, "blue");
			details1.put(24, "green");
			details1.put(20, "grey");
			details1.put(15,"yellow");
			details1.put(28, "white");
			details1.put(13, "red");
			details1.put(59, "blue");
			details1.put(30, "green");
			details1.put(22, "grey");
			details1.put(51,"yellow");
			details1.put(90, "white");
			details1.put(58,"yellow");
			details1.put(26, "white");
			System.out.println(details1);
	}

}
