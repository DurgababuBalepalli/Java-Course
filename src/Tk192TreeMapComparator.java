import java.util.Comparator;
import java.util.TreeMap;
public class Tk192TreeMapComparator {

	public static void main(String[] args) {
		TreeMap<Integer,String> details = new TreeMap<>(new Mycom());
		details.put(5, "durgababu");
		details.put(1, "N160127");
		details.put(8, "79957214");
		details.put(2, "Tuni");
		details.put(9, "Ramer");
		details.put(3, "99080");
		details.put(7, "hello");
		
		System.out.println(details); //i will get data in reversed order
	}
	
	//iam creating staic class inside the class
	
	public static class Mycom implements Comparator<Integer>
	{

		@Override
		public int compare(Integer o1, Integer o2)   
		{
			return (o1<o2) ? 1 : -1;
		}
		
	}
		
}
