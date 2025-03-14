import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Tk113AccessVectorElements {

	public static void main(String[] args) {
		Vector<String> animals = new Vector<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("buffalo");
		animals.add("tiger");
		
		//using for loop
		for(String s:animals)
		{
			System.out.println(s);
		}
		
		System.out.println("------------------------------------------");
		
		//using iterator
		Iterator it = animals.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------------------------");
		//using enumaration class also accisible(only for vector).because enumeration is also legacy interface
		Enumeration et = animals.elements(); //elements method useful to get constants in enum class
		while(et.hasMoreElements())
		{
			System.out.println(et.nextElement());
		}
	}

}
