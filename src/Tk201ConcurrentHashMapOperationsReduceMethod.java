import java.util.concurrent.ConcurrentHashMap;

//The reduce() method accumulates (gather together) each entry in a map. 
//This can be used when we need all the entries to perform a common task, like adding all the values of a map.


public class Tk201ConcurrentHashMapOperationsReduceMethod {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "YAKOB");
		details.put(3, "n16089");
		details.put(7, "99088h");
		
		Object sum = details.reduce(3, (keys,values)->keys,   //(k, v) -> v is a transformer function. It transfers the key/value mappings into values only
							(allkeys1,allkeys2) -> (allkeys1+allkeys2));  //(v1, v2) -> v1+v2 is a reducer function. It gathers together all the values and adds all values.
		System.out.println(sum);
	}

}
