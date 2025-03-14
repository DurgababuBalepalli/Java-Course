package stringsPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Hello {
	public static void main(String[] args) 
	{
		//add() - inserts the specified element to the set
		//addAll() - inserts all the elements of the specified collection to the set
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(3);
		System.out.println(numbers);
		
		HashSet<Integer> evens = new HashSet<>();
		evens.add(2);
		evens.add(4);
		
		evens.addAll(numbers);        //using addall
		System.out.println(evens);
		
		numbers.remove(1);  //removing an element
		System.out.println(numbers);
		
		numbers.removeAll(numbers);  //removing all elements
		System.out.println(numbers);
		
		//unionof sets
		evens.addAll(numbers);        
		System.out.println(evens);
		
		//intersection of Sets
		evens.retainAll(numbers);
		System.out.println(evens);
		
		//difference operation between 2 sets
		numbers.removeAll(evens);
		System.out.println(numbers);
		
		boolean b = numbers.containsAll(evens);  //if evens are subset to numbers it will give true.
		System.out.println(b);
		
		//clone()	Creates a copy of the HashSet
		//contains()	Searches the HashSet for the specified element and returns a boolean result
		//isEmpty()	Checks if the HashSet is empty
		//size()	Returns the size of the HashSet
		//clear()	Removes all the elements from the HashSet

	}	
}
