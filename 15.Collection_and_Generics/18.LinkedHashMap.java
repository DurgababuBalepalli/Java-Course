package stringsPractice;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hello {

	public static void main(String[] args) throws InterruptedException 
	{
		//LinkedHashMap not following the order.but treemap follows ascending order
		LinkedHashMap<Integer,String> details = new LinkedHashMap<>();
		details.put(1, "red");
		details.put(56, "blue");
		details.put(3, "green");
		details.put(2, "grey");
		details.put(5,"yellow");
		details.put(23, "white");
		details.put(12, "red");
		details.put(13, "blue");
		details.put(24, "green");
		
		System.out.println(details);
		
		System.out.println(details.get(12)); //using get method iam fetching values.
		System.out.println(details.values()); //returns set view of values
		System.out.println(details.keySet()); //returns set view of keys
		System.out.println(details.entrySet()); //gives set view (here set view means [])of keys and values. 
		
		//replace() - change LinkedHashMap value
		String change = details.replace(12, "violate");
		System.out.println("changedValue :"+change);
		
		//remove - remove elements from map
		details.remove("phoneno");
		System.out.println(details);
		
		//isEmpty()	checks if the LinkedHashMap is empty
		System.out.println(details.isEmpty());
		
		//size()	returns the number of items in LinkedHashMap
		System.out.println(details.size());
		
		//containsValue()	checks if LinkedHashMap contains the specified value
		System.out.println(details.containsValue("blue"));
		
		//containsKey()	checks if the specified key is present in LinkedHashMap
		System.out.println(details.containsKey(23));
		
		//clone() method makes the shallow copy of the LinkedHashMap and returns it
		LinkedHashMap<String,String> cloned = (LinkedHashMap<String, String>) details.clone();
		System.out.println(cloned);
		
		//merge() method - merges the specified mapping to the LinkedHashMap
		//compute() - computes a new value for the specified key
		//computeIfAbsent() - computes value if a mapping for the key is not present
		//computeIfPresent() - computes a value for mapping if the key is present
		
		System.out.println("-----creating LinkedHashMap from tree map---------");
		//here  iam creating LinkedHashMap from treemap
		TreeMap<String,String> details1 = new TreeMap<>();
		details1.put("name", "durgababu");
		details1.put("id", "N160127");
				
		//creating LinkedHashMap from tree map
		LinkedHashMap<String,String> data = new LinkedHashMap<>(details1); //iam passing treemap object here.
		data.put("phoneno", "79957214");
		data.put("address", "Tuni");
				
		System.out.println(data);
		
	}
		
}
