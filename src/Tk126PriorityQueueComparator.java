import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Hol implements Comparator<Integer>
{

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1<o2)
			{
				return 1;
			}
			else
			{
				return -1;
			}	
		}
}
public class Tk126PriorityQueueComparator {

	public static void main(String[] args) 
	{
		List<Integer> mylis = new ArrayList<>();
		mylis.add(4);
		mylis.add(9);
		mylis.add(1);
		mylis.add(5);
		mylis.add(8);
		
		//now i want to sort without using sort method.so have take Hola class and impleted comparator interface
		Comparator<Integer> mycom = new Hol();
		Collections.sort(mylis, mycom);
		
		for(int i:mylis)
		{
			System.out.println(i);
		}

	}

}
