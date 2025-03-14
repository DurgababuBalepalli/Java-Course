package stringsPractice;

import java.util.HashMap;
import java.util.TreeMap;

public class Hello {

	public static void main(String[] args) throws InterruptedException 
	{
		//hashmap not following the order.but treemap follows ascending order
		HashMap<Integer,String> details = new HashMap<>();
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
		
		//replace() - change hashmap value
		String change = details.replace(12, "violate");
		System.out.println("changedValue :"+change);
		
		//remove - remove elements from map
		details.remove("phoneno");
		System.out.println(details);
		
		//isEmpty()	checks if the Hashmap is empty
		System.out.println(details.isEmpty());
		
		//size()	returns the number of items in HashMap
		System.out.println(details.size());
		
		//containsValue()	checks if Hashmap contains the specified value
		System.out.println(details.containsValue("blue"));
		
		//containsKey()	checks if the specified key is present in Hashmap
		System.out.println(details.containsKey(23));
		
		//clone() method makes the shallow copy of the hashmap and returns it
		HashMap<String,String> cloned = (HashMap<String, String>) details.clone();
		System.out.println(cloned);
		
		//merge() method - merges the specified mapping to the HashMap
		//compute() - computes a new value for the specified key
		//computeIfAbsent() - computes value if a mapping for the key is not present
		//computeIfPresent() - computes a value for mapping if the key is present
		
		System.out.println("-----creating HashMap from tree map---------");
		//here  iam creating hashmap from treemap
		TreeMap<String,String> details1 = new TreeMap<>();
		details1.put("name", "durgababu");
		details1.put("id", "N160127");
				
		//creating hashmap from tree map
		HashMap<String,String> data = new HashMap<>(details1); //iam passing treemap object here.
		data.put("phoneno", "79957214");
		data.put("address", "Tuni");
				
		System.out.println(data);
		
	}
		
}
