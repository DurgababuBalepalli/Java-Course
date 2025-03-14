package stringsPractice;

import java.util.Stack;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Hello {

	public static void main(String[] args) 
	{
		PriorityQueue<String> fruits  = new PriorityQueue<>();
		//add and offer methods useful to add elements.
		//add() - Inserts the specified element to the queue. If the queue is full, it throws an exception
		//offer() - Inserts the specified element to the queue. If the queue is full, it returns false
		
		fruits.offer("Apple");
		fruits.offer("orange");
		fruits.offer("grape");
		fruits.offer("banana");
		
		//1st way
		System.out.println(fruits);

		//2nd way
		for(Object fr : fruits)
		{
			System.out.println(fr);
		}
		
		//peek() and element() methods, returns the head of the queue
		System.out.println(fruits.peek());
		System.out.println(fruits.element());
		
		//remove and poll useful to remove elements.
		String removedFruit1 = fruits.remove();
		System.out.println(removedFruit1);
				
		String removedFruit = fruits.poll();
		System.out.println(removedFruit);
		
		//iterator
		Iterator<String> it = fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//NOTE:if stack full add,element,remove methods throws an exception.but offer,peek,poll gives false.
		
		//contains(element)	Searches the priority queue for the specified element. If the element is found, it returns true, if not it returns false.
		boolean b  = fruits.contains("grape");
		System.out.println(b);
		
		//size()	Returns the length of the priority queue.
		System.out.println(fruits.size());
		
		//toArray() -	Converts a priority queue to an array and returns it.
		
		System.out.println("------------------toArray with parameter----------");
		String[] arr  = new String[fruits.size()]; //creating same size array as LinkedList
		fruits.toArray(arr); //iam using arr.meansiam using parameter to toArray
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		System.out.println("------------------toArray without parameter----------");
		Object[] arr1 = fruits.toArray();   //iam using object array directly
		for(Object myobj:arr1)
		{
			System.out.println(myobj);
		}
	}
		
}

//you can use comparator for any collection.so specifically iam not mensioning here.
