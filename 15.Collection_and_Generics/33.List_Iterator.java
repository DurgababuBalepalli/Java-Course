package stringsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Hello {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);

		ListIterator<Integer> it = numbers.listIterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.previous());
		
		System.out.println("--------------FORWARD ORDER-------------------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------BACKWARD ORDER-------------------");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
		ListIterator<Integer> it1 = numbers.listIterator();
		it1.next();  //3
		it1.next();  //5
		System.out.println(it1.nextIndex());  //2
		it1.previous();  //5
		it1.previous();  //3
		System.out.println(it1.previousIndex());  //-1
		
		it1.set(100);  //in place of 3, 100 will placed
		System.out.println(numbers);
		
		it1.remove();  //100 will be removed
		System.out.println(numbers);
	}
}
