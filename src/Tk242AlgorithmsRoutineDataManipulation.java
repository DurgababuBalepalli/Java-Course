import java.util.ArrayList;
import java.util.Collections;

public class Tk242AlgorithmsRoutineDataManipulation {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(1);
		numbers.add(9);
		numbers.add(2);
		
		
		System.out.println(numbers);
		
		Collections.reverse(numbers);   //reverse of list
		System.out.println(numbers);

		Collections.swap(numbers, 0, 2);  //0,2 are indexes.
		System.out.println(numbers);  
		
		
		//visit the following link for copy method https://www.geeksforgeeks.org/collections-copy-method-in-java-with-examples/
		ArrayList<Integer> tens = new ArrayList<>();
		tens.add(10);
		tens.add(20);
		tens.add(30);
		tens.add(40);
		
		//System.out.println(numbers);
		//System.out.println(tens);
		
		Collections.copy(tens, numbers);
		System.out.println(tens);
		
		Collections.fill(numbers, 0);  //inlist fills entire things with zero
		System.out.println(numbers);

	}

}
