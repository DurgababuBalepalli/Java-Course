import java.util.TreeMap;

public class Tk183InsertElementsToTreeMap {

	public static void main(String[] args) {
		TreeMap<String,String> details = new TreeMap<>();
		details.put("name", "durgababu");
		details.put("id", "N160127");
		details.put("phoneno", "79957214");
		details.put("address", "Tuni");
		
		details.putIfAbsent("hello", "hai");  //using put if Absent
		
		//using putall
		TreeMap<String,String> data = new TreeMap<>();
		data.put("blood", "red");
		data.putAll(details);
		
		System.out.println(data);
	}

}
