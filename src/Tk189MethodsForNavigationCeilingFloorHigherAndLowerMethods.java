import java.util.TreeMap;

public class Tk189MethodsForNavigationCeilingFloorHigherAndLowerMethods {

	public static void main(String[] args) {
		TreeMap<Integer,String> details = new TreeMap<>();
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "Tuni");
		details.put(9, "Ramer");
		details.put(3, "99080");
		details.put(7, "hello");
		
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
	}

}
