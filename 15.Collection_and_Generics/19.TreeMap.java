package stringsPractice;

import java.util.TreeMap;
import java.util.TreeMap;

public class Hello {

	public static void main(String[] args) throws InterruptedException 
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
		details.put(24, "green");
		
		System.out.println(details);
		
		System.out.println(details.get(12)); //using get method iam fetching values.
		System.out.println(details.values()); //returns set view of values
		System.out.println(details.keySet()); //returns set view of keys
		System.out.println(details.entrySet()); //gives set view (here set view means [])of keys and values. 
		
		//replace() - change TreeMap value
		String change = details.replace(12, "violate");
		System.out.println("changedValue :"+change);
		
		//remove - remove elements from map
		details.remove(12);
		System.out.println(details);
		
		//isEmpty()	checks if the TreeMap is empty
		System.out.println(details.isEmpty());
		
		//size()	returns the number of items in TreeMap
		System.out.println(details.size());
		
		//containsValue()	checks if TreeMap contains the specified value
		System.out.println(details.containsValue("blue"));
		
		//containsKey()	checks if the specified key is present in TreeMap
		System.out.println(details.containsKey(23));
		
		//clone() method makes the shallow copy of the TreeMap and returns it
		TreeMap<String,String> cloned = (TreeMap<String, String>) details.clone();
		System.out.println(cloned);
		
		//merge() method - merges the specified mapping to the TreeMap
		//compute() - computes a new value for the specified key
		//computeIfAbsent() - computes value if a mapping for the key is not present
		//computeIfPresent() - computes a value for mapping if the key is present
		
		System.out.println("-----creating TreeMap from tree map---------");
		//here  iam creating TreeMap from treemap
		TreeMap<String,String> details1 = new TreeMap<>();
		details1.put("name", "durgababu");
		details1.put("id", "N160127");
				
		//creating TreeMap from tree map
		TreeMap<String,String> data = new TreeMap<>(details1); //iam passing treemap object here.
		data.put("phoneno", "79957214");
		data.put("address", "Tuni");
				
		System.out.println(data);
		
		System.out.println("--------------Navigation Interface methods------------");
		
		System.out.println(details.firstEntry());
		System.out.println(details.lastEntry());
		System.out.println(details.pollFirstEntry());
		System.out.println(details.pollLastEntry());
		
		//higherKey,HigherEntry
		System.out.println(details.higherKey(3)); //the highest key after 3 will be printed
		System.out.println(details.higherEntry(2)); //keyvalue pair(i.e Entry) higherthan 2 will be printed

		//lowerKey,lowerEntry
		System.out.println(details.lowerKey(3));
		System.out.println(details.lowerEntry(3));
		
		//CeilingKey,CeilingEntry
		System.out.println(details.ceilingKey(4));  //4 key is not present.so highest key than 4 is 5.so 5 is returned.if you give anykey presented in treemap returns the same value.
		System.out.println(details.ceilingEntry(4));
		
		//floorKey,floorEntry
		System.out.println(details.floorKey(10));
		System.out.println(details.floorEntry(10));
		
		//poll first and pollast
		details.pollFirstEntry();
		System.out.println(details);
		
		details.pollLastEntry();
		System.out.println(details);
		
		//headMap - booleans are always optional.here by default boolean is false
		System.out.println(details.headMap(5)); //the entries which are present top of 5 will returned.
		System.out.println(details.headMap(3,true));  //you can also use along with boolean.bydefault boolean is false.if you give true,it includes current entry also(i.e 3)
		
		//tailMap - here default value of boolean is true.
		System.out.println(details.tailMap(5));
		System.out.println(details.tailMap(3,true));
		
		//SubMap
		System.out.println(details.subMap(2,7));  //2 is included and 7 excluded
		System.out.println(details.subMap(1,false, 5,true));
	}
		
}
