import java.util.LinkedList;
import java.util.List;

public class Tk105ImplementingLinkedListClassInListInterface {

	public static void main(String[] args) {
		List<Integer> twotable = new LinkedList<>();
		twotable.add(2);
		twotable.add(4);
		twotable.add(6);
		twotable.add(8);
		
		//accessing elements
		System.out.println(twotable.get(2)); //index 2 element 6 will be printed
		
		//to get index of perticular number
		System.out.println(twotable.indexOf(8)); //index of 8 is 3
		
		int removed = twotable.remove(2);  //ofcourse you don't require to store.but no problem.
		System.out.println(removed);   //index 2 elemnt will be removed i.e 6
		System.out.println(twotable);
	}

}
