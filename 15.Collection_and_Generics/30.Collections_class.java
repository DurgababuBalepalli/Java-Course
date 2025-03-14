package stringsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Hello {
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(12);
		mylist.add(1);
		mylist.add(13);
		mylist.add(2);
		
		Collections.sort(mylist);
		//Collections.reverse(mylist);
		System.out.println(mylist);
		
		//suffle
		Collections.shuffle(mylist);
		System.out.println(mylist);
		
		//swap
		Collections.swap(mylist, 0, 2);  //0,2 are indexes.
		System.out.println(mylist); 
		
		//visit the following link for copy method https://www.geeksforgeeks.org/collections-copy-method-in-java-with-examples/
		ArrayList<Integer> tens = new ArrayList<>();
		tens.add(10);
		tens.add(20);
		tens.add(30);
		tens.add(40);
		
		//System.out.println(mylist);
		//System.out.println(tens);
		
		Collections.copy(tens, mylist);
		System.out.println(tens);
		
		//Collections.fill(mylist, 0);  //inlist fills entire things with zero
		//System.out.println(mylist);

		Collections.sort(mylist);  //before binarySearch we have to sort.
		int position = Collections.binarySearch(mylist, 12);
		System.out.println(position);
		
		int twos = Collections.frequency(mylist, 2);
		System.out.println(twos);
		
		ArrayList<Integer> odds = new ArrayList<>();
		odds.add(3);
		odds.add(5);
		odds.add(7);
		
		boolean b = Collections.disjoint(mylist, odds);
		System.out.println(b);
		
		int a = Collections.min(mylist);
		System.out.println(a);
		
		int b1 =Collections.max(mylist);
		System.out.println(b1);
		
		
	}
}
