import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hello 
{
	public static void main(String[] args)
	{
		List<Integer> obj = new ArrayList<>();
		
		obj.add(505);
		obj.add(802);
		obj.add(109);
		
		Comparator<Integer> mycom = new Comparator<>() 
									{
										public int compare(Integer i,Integer j)
										{
											if(i%10 > j%10)
												return 1;         //you can use ternary operator return (i%10 > j%10)?1 :-1;
											else
												return -1;
										}
									};
		
		Collections.sort(obj, mycom );
		for(Integer i:obj)
		{
			System.out.println(i);
		}
	}
}

//you can also use lambda expression.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hello 
{
	public static void main(String[] args)
	{
		List<Integer> obj = new ArrayList<>();
		
		obj.add(505);
		obj.add(802);
		obj.add(109);
		
		Comparator<Integer> mycom = (i,j) -> (i%10>j%10)?1:-1;    //lambda expression doesnot asks type of parameter(i.e Integer i) and return statement also
		
		Collections.sort(obj, mycom );    //even you can paste "(i,j) -> (i%10>j%10)?1:-1" this stuff in place of mycom.
		for(Integer i:obj)
		{
			System.out.println(i);
		}
	}
}

//comparator example
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


//comparator for strings
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
