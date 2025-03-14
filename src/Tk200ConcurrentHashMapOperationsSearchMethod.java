import java.util.concurrent.ConcurrentHashMap;

public class Tk200ConcurrentHashMapOperationsSearchMethod {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "YAKOB");
		details.put(3, "n16089");
		details.put(7, "99088h");
		
		Object s = details.search(3,(keys,values)->{return values=="YAKOB"?keys:null;});  //yakob key is 2
		System.out.println(s);
	}

}
