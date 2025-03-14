import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


//Collection
public class Hello
{
	public static void main(String[] args)
	{
		Collection numbers = new ArrayList();   //ArrayList is a class which implements List.list extends collection.so Arraylist is implementing Collection indirectly
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		
		//System.out.println(numbers);
		
		//how to print values one by one.since we don't have index numbers as an array.so we have Iterator interface.iterator method fetch all values from collection and place it into iterator obj
		
		Iterator myit = numbers.iterator();  //observe iterator method has small 'i'
		/*
		System.out.println(myit.next());   //gives 5
		System.out.println(myit.next());   //gives 7
		System.out.println(myit.next());   //gives 9   */
		
		//you can write using a loo
		while(myit.hasNext())   //hasnext is a method which checks whether you have next element or not
		{
			System.out.println(myit.next());
		}
		
	}
}
