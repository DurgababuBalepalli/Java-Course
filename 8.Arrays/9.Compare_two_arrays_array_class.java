import java.util.*;
class Compare_arrays
{
	public static void main(String[] args) {
		int[] array1 = {10,45,67,23,12};
		int[] array2 = {10,12,23};  //take sorted array to compare.otherwise sort using method.
		System.out.println(Arrays.compare(array1,array2));
	}
}