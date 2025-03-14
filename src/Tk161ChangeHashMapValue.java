import java.util.HashMap;
import java.util.Map;

public class Tk161ChangeHashMapValue {

	public static void main(String[] args) {
		Map<String,String> details = new HashMap<>();
		details.put("name", "durgababu");
		details.put("id", "N160127");
		details.put("phoneno", "79957214");
		details.put("address", "Tuni");
		
		String change = details.replace("address", "Nandivampu");
		System.out.println("changedValue :"+change);
		System.out.println(details);
	}

}
