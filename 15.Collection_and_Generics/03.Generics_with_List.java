import java.util.ArrayList;
import java.util.List;

public class Hello
{
	public static void main(String[] args)
	{
		//List<Integer> mylist = new ArrayList<Integer>();  //1.5.
		//(or you can use)
		List<Integer> mylist = new ArrayList<>();  //1.7 or later
		
		mylist.add(5);
		mylist.add(8);
		//mylist.add("hell");  //if i remove generics this will also work.
		
		/*
		for( i:mylist)
		{
			System.out.println(i);
		} */   
		
		//instead of object you can directly use wrapper Integer class.Object also work
		for(Integer i:mylist)
		{
			System.out.println(i);
		}
	}
}