package stringsPractice;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Hello {

	public static void main(String[] args) 
	{
		ArrayDeque<String> fruits  = new ArrayDeque<>();
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
		
		System.out.println("----------ARRAY DEQUE METHODS-----------------");
		//adding elements
		fruits.add("rose");
		fruits.addFirst("gulab");
		fruits.addLast("orange");
		
		fruits.offer("rose");
		fruits.offerFirst("cat");
		fruits.offerLast("apple");
		
		//accessing
		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());
		
		System.out.println(fruits.peek());
		System.out.println(fruits.peekFirst());
		System.out.println(fruits.peekLast());
		
		//removing
		fruits.remove();
		System.out.println(fruits);
		
		fruits.removeFirst();
		System.out.println(fruits);
		
		fruits.removeLast();
		System.out.println(fruits);
		
		fruits.poll();
		System.out.println(fruits);
		
		fruits.pollFirst();
		System.out.println(fruits);
		
		fruits.pollLast();
		System.out.println(fruits);
		
		System.out.println(fruits);
		
		System.out.println("------------------------------------------------");
		
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
		
		//set,get,indexof,lastIndeof not work here
		
		//contains()	checks if the LinkedList contains the element
		boolean b1  = fruits.contains("berry");
		System.out.println(b1);
		
		//clear()	removes all the elements of the LinkedList
		fruits.clear();
		System.out.println(fruits);
	}
		
}

//you can use comparator for any collection.so specifically iam not mensioning here.