import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


//Collection

//we know list interface is implemented  by different classes.ArrayList,LinkedList,vector,stack
public class Hello
{
	public static void main(String[] args)
	{
		List numbers = new ArrayList(); 
		numbers.add(5);						//here you may think int.but it is an object.every value is an object.so it is Integer 5
		numbers.add(7);
		numbers.add(9);
		
		numbers.add(1, 6); //iam adding after 5

		//to access elements by index
		System.out.println(numbers.get(1));  //gives 5
		
		//remove elements from list
		numbers.remove(2);  //index no two element(i.e 9) will removed
		System.out.println(numbers);
		
		//ofcourse,you can use iterator.but we don't prefer it.we want always go with loop.
		for(int i=0;i<numbers.size();i++)    //size() - methods gives the last element of list
		{
			System.out.println(numbers.get(i)); //get method useful to fetch values from list. i is index,at every index we are fetching value.
		}
		
		//we can use enhanced for loop.as i said i earlier every element you pass is wrapper class obj
		for(Object i:numbers)
		{
			System.out.println(i);
		}
	}
}

//linked list

import java.util.LinkedList;
import java.util.List;

public class Hello {

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

//Vector
package stringsPractice;

import java.util.List;
import java.util.Vector;

public class Hello {

	public static void main(String[] args) 
	{
		List<Integer> twotable = new Vector<>();
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

//explore the differences between Arraylist,linked list and vector.

