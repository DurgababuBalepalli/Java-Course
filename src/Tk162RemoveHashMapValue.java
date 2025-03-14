import java.util.HashMap;
import java.util.Map;

public class Tk162RemoveHashMapValue {

	public static void main(String[] args) {
		Map<String,String> details = new HashMap<>();
		details.put("name", "durgababu");
		details.put("id", "N160127");
		details.put("phoneno", "79957214");
		details.put("address", "Tuni");

		//remove elements from map
		details.remove("phoneno");
		System.out.println(details);
	}

}
