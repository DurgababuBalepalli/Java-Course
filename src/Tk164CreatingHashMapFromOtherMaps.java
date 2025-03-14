import java.util.HashMap;
import java.util.TreeMap;

public class Tk164CreatingHashMapFromOtherMaps {

	public static void main(String[] args) {
		//here  iam creating hashmap from keymap
		//create a treemap
		TreeMap<String,String> details = new TreeMap<>();
		details.put("name", "durgababu");
		details.put("id", "N160127");
		
		//creating hashmap from tree map
		HashMap<String,String> data = new HashMap<>(details); //iam passing treemap object here.
		data.put("phoneno", "79957214");
		data.put("address", "Tuni");
		
		System.out.println(data);
	}

}
