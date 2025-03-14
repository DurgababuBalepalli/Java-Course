import java.util.*;
class From_to_to
{
	public static void main(String[] args) {
		int[] array = {5,7,22,3,9,3,0,1,33};
		Arrays.sort(array);
		int key = 9;
		System.out.println(Arrays.binarySearch(array,1,5,key));
	}
}