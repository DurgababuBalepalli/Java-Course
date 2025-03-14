import java.util.Comparator;
import java.util.TreeSet;

public class Tk239TreeSetComparator {

	public static void main(String[] args) {
		TreeSet<String> fruits = new TreeSet<>(new Mycom());
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("grape");
		fruits.add("gouva");
		
		System.out.println(fruits);

	}
	public static class Mycom implements Comparator<String>
	{

		@Override
		public int compare(String o1, String o2) {   //we have only int compare method.so compareTo logic applicable only for integers.
			int comparedValue = o1.compareTo(o2);   //so we also change logic of compareTo.aftercomparision of two objects if o1 grater to o2 gives 1 otherwise -1
			if(comparedValue > 0)    //you will get reversed order
				return -1;
			else
				return 1;
		}
		
	}

}
