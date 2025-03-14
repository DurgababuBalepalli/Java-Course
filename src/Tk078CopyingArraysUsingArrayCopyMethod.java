import java.lang.reflect.Array;
import java.util.Arrays;

public class Tk078CopyingArraysUsingArrayCopyMethod {

	public static void main(String[] args) {
		int[] array1 = {2,6,5,7,34,67,69};
		int[] array2 = new int[array1.length];
		
		//copying entire array1 to array2
		System.arraycopy(array1, 0, array2, 0,array1.length);  
		System.out.println(Arrays.toString(array2));
		
		int[] array3 = new int[array1.length];   
		System.arraycopy(array1, 2, array3, 1, 4);   //2 is from which index in first array you want to copy. 1 is in destination array from which index you want to place. 4 specifies how many elements you want from array1 to copy.
		System.out.println(Arrays.toString(array3));
	}

}
