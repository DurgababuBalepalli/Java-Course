package stringsPractice;

import java.util.HashMap;
import java.util.TreeMap;

class Hello {
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> details = new TreeMap<>();
		details.put(1, "red");
		details.put(56, "blue");
		details.put(3, "green");
		details.put(2, "grey");
		details.put(5,"yellow");
		details.put(23, "white");
		details.put(12, "red");
		details.put(13, "blue");
		//details.put(null, "green");  // java.lang.NullPointerException
		
		System.out.println(details);
		
		HashMap<Integer,String> detail = new HashMap<>();
		detail.put(1, "red");
		detail.put(56, "blue");
		detail.put(3, "green");
		detail.put(2, "grey");
		detail.put(5,"yellow");
		detail.put(23, "white");
		detail.put(12, "red");
		detail.put(null, "blue");
		detail.put(null, "green"); //green updated in place of blue
		
		System.out.println(detail);
	}
		
}
