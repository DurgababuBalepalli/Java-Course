import java.util.concurrent.ConcurrentHashMap;

public class Tk199ConcurrentHashMapOperationsForEachMethod {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> details = new ConcurrentHashMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "durgababu");
		details.put(3, "N160127");
		details.put(7, "79957214");
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
	}

}
