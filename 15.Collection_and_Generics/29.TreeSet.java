package stringsPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Hello {
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(2);
		
		TreeSet<Integer> tens = new TreeSet<>();
		tens.add(10);
		tens.add(20);
		
		tens.addAll(numbers);
		System.out.println(tens);
		
		//set operations
		TreeSet<Integer> hundreds = new TreeSet<>();
		hundreds.add(100);
		hundreds.add(200);
		
		//union
		hundreds.addAll(numbers);
		System.out.println(hundreds);
		
		//intersection
		hundreds.retainAll(numbers);
		System.out.println(hundreds);
		
		//diiference
		hundreds.removeAll(numbers);
		System.out.println(hundreds);

		//subset
		boolean b= numbers.containsAll(hundreds);
		System.out.println(b);
		
		
		System.out.println("-----Navigable Interface methods in Tree set-----------");
		
		System.out.println(numbers.first());
		System.out.println(numbers.last());
		
		System.out.println(numbers.lower(4));
		System.out.println(numbers.higher(4));
		System.out.println(numbers.ceiling(3));
		System.out.println(numbers.floor(3));
		
		numbers.pollFirst();
		System.out.println(numbers);
		
		numbers.pollLast();
		System.out.println(numbers);
		
		System.out.println("-----------------HEADSET----------------");
		System.out.println(numbers.headSet(4));
		System.out.println(numbers.headSet(4,true));
		
		System.out.println("-----------------TAILSET----------------");
		System.out.println(numbers.tailSet(4));
		System.out.println(numbers.tailSet(4,false));
		
		System.out.println("-----------------SUBSET----------------");
		System.out.println(numbers.subSet(2, 5));
		System.out.println(numbers.subSet(2,false,5,true));
		
		numbers.remove(4);
		System.out.println(numbers);
		
		numbers.removeAll(numbers);
		System.out.println(numbers);
		
	}
}
