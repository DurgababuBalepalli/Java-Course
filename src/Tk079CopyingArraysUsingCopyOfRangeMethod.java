import java.util.Arrays;

public class Tk079CopyingArraysUsingCopyOfRangeMethod {

	public static void main(String[] args) {
		int[] array1 = {34,78,90,1,2,45,67,23,46};
		
		//entire array copy
		int[] array2 = Arrays.copyOfRange(array1, 0, array1.length);
		System.out.println(Arrays.toString(array2));

		//copying array1 from specific index to specific index
		int[] array3 = Arrays.copyOfRange(array1, 2, 5);  //from index 2 to 4 will copied.(5 excluded)
		System.out.println(Arrays.toString(array3));
	}

}
