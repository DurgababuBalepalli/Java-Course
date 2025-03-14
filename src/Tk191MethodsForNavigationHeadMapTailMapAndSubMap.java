import java.util.TreeMap;

public class Tk191MethodsForNavigationHeadMapTailMapAndSubMap {

	public static void main(String[] args) {
		//The headMap() method returns all the key/value pairs of a treemap before the specified key (which is passed as an argument).
		TreeMap<Integer,String> details = new TreeMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "Tuni");
		details.put(9, "Ramer");
		details.put(3, "99080");
		details.put(7, "hello");
		
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
