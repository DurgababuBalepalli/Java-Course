package stringsPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

class Hello {
	public static void main(String[] args) {
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();
		nums.add(12);
		nums.add(11);
		nums.add(13);
		System.out.println(nums);

		LinkedHashSet<Integer> Hundreds = new LinkedHashSet<>();
		Hundreds.add(100);
		Hundreds.add(200);
		Hundreds.addAll(nums);
		System.out.println(Hundreds);
		
		//unionof sets
		nums.addAll(nums);        
		System.out.println(Hundreds);
		
		//interdectionof sets
		nums.retainAll(nums);        
		System.out.println(nums);
		
		//diffrence of sets
		nums.removeAll(Hundreds);        
		System.out.println(nums);

		//Subset
		boolean b = nums.containsAll(Hundreds);       
		System.out.println(b);
		
		nums.remove(11);  //removing an element
		System.out.println(nums);
		
		nums.removeAll(nums);  //removing all elements
		System.out.println(nums);
		
		System.out.println("-----------Creating LinkedHashSet From Other Collection------------");
		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.add(3);
		nums1.add(6);
		nums1.add(9);
		nums1.add(1);
		
		LinkedHashSet<Integer> nums2 = new LinkedHashSet<>(nums1);
		nums2.add(100);
		nums2.add(200);
		System.out.println(nums2);
		
	}
}
