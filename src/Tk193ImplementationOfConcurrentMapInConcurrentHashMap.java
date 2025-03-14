import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Tk193ImplementationOfConcurrentMapInConcurrentHashMap {

	public static void main(String[] args) {
		//The ConcurrentMap interface of the Java collections framework provides a thread-safe map.
		//ConcurrentMap is known as a synchronized map.
		ConcurrentMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "Tuni");
		details.put(9, "Ramer");
		details.put(3, "99080");
		details.put(7, "hello");
		
		System.out.println(details.get(3));
		details.remove(9);
		System.out.println(details);
	}

}
