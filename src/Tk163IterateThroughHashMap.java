import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tk163IterateThroughHashMap {

	public static void main(String[] args) {
		Map<String,String> details = new HashMap<>();
		details.put("name", "durgababu");
		details.put("id", "N160127");
		details.put("phoneno", "79957214");
		details.put("address", "Tuni");
		
		//iterate through keys only
		for(String s:details.keySet())
		{
			System.out.println(s);
		}
		
		//iterating through values only
		for(String s:details.values())
		{
			System.out.println(s);
		}
		
		//iterating through keys/values entries
		for(Entry<String, String> s:details.entrySet())
		{
			System.out.println(s);
		}
	}

}
