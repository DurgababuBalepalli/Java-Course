import java.util.TreeMap;

public class Tk187ReplaceTreeMapElements {

	public static void main(String[] args) {
		TreeMap<Integer,String> evens = new TreeMap<>();
		evens.put(2, "Two");
		evens.put(4, "four");
		evens.put(6, "six");
		evens.put(8, "eight");
		evens.put(10, "Ten");
		evens.put(3, "three");
		
		evens.replace(3, "Twelve");
		System.out.println(evens);
		evens.replaceAll((key,oldValue)->oldValue+"00");
		System.out.println(evens);
	}

}
