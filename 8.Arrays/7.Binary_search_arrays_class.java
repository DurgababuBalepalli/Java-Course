import java.util.*;
class Binary_search
{
	public static void main(String[] args) {
		int[] array = {4,2,9,5,1,8};
		Arrays.sort(array);          //before search,we have to sort
		System.out.println(Arrays.binarySearch(array,3)); //displays index of the elemnt.
	}
}