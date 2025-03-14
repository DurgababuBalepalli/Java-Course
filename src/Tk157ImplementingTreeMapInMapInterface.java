import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tk157ImplementingTreeMapInMapInterface {

	public static void main(String[] args) {
		Map<String,String> details = new TreeMap<>();
		details.put("name", "durgababu");
		details.put("id", "N160127");
		details.put("phoneno", "79957214");
		details.put("address", "Tuni");
		
		System.out.println(details.keySet());   //access keys of Map
		System.out.println(details.values());   //access values of Map
		//entrySet() - Returns a set of all the key/value mapping present in a map.
		System.out.println(details.entrySet());  //access entries of map
		
		//remove elements from map
		details.remove("phoneno");
		System.out.println(details);
		
		//replacing the values
		details.replace("address","EastGodavari");
		System.out.println(details);

	}

}
