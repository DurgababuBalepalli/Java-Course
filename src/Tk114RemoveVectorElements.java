import java.util.Vector;

public class Tk114RemoveVectorElements {

	public static void main(String[] args) {
		Vector<String> animals = new Vector<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("buffalo");
		animals.add("tiger");
		
		animals.remove(1);  //by using index
		System.out.println(animals);
		
		animals.remove("tiger"); //by using object 
		System.out.println(animals);
		
		//removing all elements using removeall
		//animals.removeAll(animals);
		System.out.println(animals);
		
		//clear is efficient than removeall
		animals.clear();
		System.out.println(animals);
	}

}
