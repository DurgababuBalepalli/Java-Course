import java.util.ArrayList;

public class Tk111IterateThroughArrayListUsingForEach {

	public static void main(String[] args) {
		ArrayList<String> phones = new ArrayList<>();
		phones.add("iphone");
		phones.add("samsung");
		phones.add("realme");
		phones.add("micro");
		
		//using object datatype
		for(Object i:phones)
		{
			System.out.println(i);
		}
		
		//using Wrapper class
		for(String ph:phones)
		{
			System.out.println(ph);
		}

	}

}
