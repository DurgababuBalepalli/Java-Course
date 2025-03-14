package stringsPractice;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Hello {
	public static void main(String[] args) 
	{
		ConcurrentHashMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");

		details.putIfAbsent(2, "wastefellow");  //using putifabsent
		
		ConcurrentHashMap<Integer,String> data = new ConcurrentHashMap<>();  
		data.put(3, "tuni");
		
		data.putAll(details);  //using putall
		System.out.println(data);
		
		System.out.println(details.keySet());  //keyset
		System.out.println(details.values());  //values
		System.out.println(details.entrySet()); //entryset
		
		System.out.println(details.get(5));  //using get
		System.out.println(details.getOrDefault(3, "your asked element not present"));  //if place 8,related data(i.e 79957214) gives.
		
		String removed = details.remove(8);
		System.out.println(removed);
		System.out.println(details.keySet());
		
		boolean b = details.remove(1, "N160127");
		System.out.println(details);

		//parallelismThreshold - It specifies that after how many elements operations in a map are executed in parallel.
		//transformer - This will transform the data before the data is passed to the specified function.
		
		details.forEach(4,(mykeys,myvalues)->System.out.println(mykeys+" "+myvalues)); //parallel threshold 4. This means if the map contains 4 entries, the operation will be executed in parallel.
		
		System.out.println("----------------------------------------------------------------");
		
		details.forEach(3,(keys,values)-> values,        //(keys, values) -> values is a transformer function. It transfers the key/value mappings into values only.
							(myvalues) -> System.out.println(myvalues));		
		
		System.out.println("--------------------------NOW IAM TAKING KEYS--------------------");
		details.forEach(3,(ourkeys,ourvalues)-> ourkeys,
							(ourkeys)->System.out.println(ourkeys));
		
		System.out.println("--------------------------WITHOUT TRANSFORMER---------------------");
		details.forEach(3,(ourkeys,ourvalues)-> System.out.println(ourkeys));
		
		Object s = details.search(3,(keys,values)->{return values=="YAKOB"?keys:null;});  //yakob key is 2
		System.out.println(s);
		
		Object sum = details.reduce(3, (keys,values)->keys,   //(k, v) -> v is a transformer function. It transfers the key/value mappings into values only
				(allkeys1,allkeys2) -> (allkeys1+allkeys2));  //(v1, v2) -> v1+v2 is a reducer function. It gathers together all the values and adds all values.
		System.out.println(sum);
		
		System.out.println("--------ImplementationOfConcurrentMapInConcurrentHashMap-------");
		//The ConcurrentMap interface of the Java collections framework provides a thread-safe map.
		//ConcurrentMap is known as a synchronized map.
		ConcurrentMap<Integer,String> details1 = new ConcurrentHashMap<>();
		details1.put(5, "durgababu");
		details1.put(1, "N160127");
		details1.put(8, "79957214");
		details1.put(2, "Tuni");
		details1.put(9, "Ramer");
		details1.put(3, "99080");
		details1.put(7, "hello");
		
		System.out.println(details1.get(3));
		details1.remove(9);
		System.out.println(details1);
		
		System.out.println("-----------concurrent hashmap from hashmap------------------------");
		
		HashMap<Integer,String> details2 = new HashMap<>();
		details2.put(5, "durgababu");
		details2.put(1, "N160127");
		details2.put(8, "79957214");
		
		ConcurrentHashMap<Integer,String> data1 = new ConcurrentHashMap<>(details2);
		//data.putAll(details2); you can use put method.or you can directly pass here ConcurrentHashMap<>();
		data1.put(2, "Tuni");
		data1.put(9, "Ramer");

		System.out.println(data1);
		
	}	
}
