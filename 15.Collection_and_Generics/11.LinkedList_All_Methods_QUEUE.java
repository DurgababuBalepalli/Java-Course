package stringsPractice;

import java.util.Stack;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Hello {

	public static void main(String[] args) 
	{
		LinkedList<String> fruits  = new LinkedList<>();
		//add and offer methods useful to add elements.
		//add() - Inserts the specified element to the queue. If the queue is full, it throws an exception
		//offer() - Inserts the specified element to the queue. If the queue is full, it returns false
		
		fruits.offer("Apple");
		fruits.offer("orange");
		fruits.offer("grape");
		fruits.offer("banana");
		fruits.offer("berry");
		fruits.offer("citrus");
		fruits.offer("lemon");
		fruits.offer("orange");
		
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
		
		//set - iam setting lotus and removing banana there
		fruits.set(1, "lotus");
		System.out.println(fruits);
		
		//get() - for accessing
		System.out.println(fruits.get(1));
		
		//contains()	checks if the LinkedList contains the element
		boolean b1  = fruits.contains("berry");
		System.out.println(b1);
		
		//indexOf()	returns the index of the first occurrence of the element
		System.out.println(fruits.indexOf("berry"));
		
		//lastIndexOf()	returns the index of the last occurrence of the element
		System.out.println(fruits.lastIndexOf("orange"));
		
		//using Dequeue methods in Linked List
		
		fruits.addFirst("Almond");
		System.out.println(fruits);
		
		fruits.addLast("cashew");
		System.out.println(fruits);
		
		fruits.removeFirst();  //removes first element of queue
		System.out.println(fruits);
		
		fruits.removeLast();  //removes last element of queue
		System.out.println(fruits);
		
		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());
		
		//clear()	removes all the elements of the LinkedList
		fruits.clear();
		System.out.println(fruits);
	}
		
}

//you can use comparator for any collection.so specifically iam not mensioning here.
