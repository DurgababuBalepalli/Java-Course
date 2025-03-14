import java.util.HashMap;
import java.util.Map;

public class Tk160AccessHashMapElements {

	public static void main(String[] args) {
		Map<String,String> details = new HashMap<>();
		details.put("name", "durgababu");
		details.put("id", "N160127");
		details.put("phoneno", "79957214");
		details.put("address", "Tuni");
		
		System.out.println(details.get("address")); //using get method iam fetching values.
		System.out.println(details.values()); //returns set view of values
		System.out.println(details.keySet()); //returns set view of keys
		System.out.println(details.entrySet()); //gives set view (here set view means [])of keys and values. 
	}

}
