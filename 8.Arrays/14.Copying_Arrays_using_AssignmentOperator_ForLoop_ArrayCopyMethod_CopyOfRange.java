package stringsPractice;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) 
	{
		System.out.println("------------------COPYING ARRAYS USING ASSIGNMENT OPERATOR--------------");
		
		int[] myarray = {23,56,12};
		int[] copiedArray = myarray; //simply iam assigning myarray to new Array(i.e coppied array)
		
		for(int i:copiedArray)   //printing the copiedArray
		{
			System.out.println(i+",");
		}
		
		System.out.println("------------------COPYING ARRAYS USING FORLOOP--------------");
		
		int[] myarray1 = {4,7,1,36,45,89};
		int[] otherarray = new int[myarray1.length];
		
		for(int i = 0;i<myarray1.length;i++)
		{
			otherarray[i] = myarray1[i];
		}
		
		//converting array to String
		System.out.println(Arrays.toString(otherarray));
		
		System.out.println("------------------COPYING ARRAYS USING ARRAYCOPYMETHOD--------------");  //if you want to copy from perticular index to perticular index.
		
		int[] array1 = {2,6,5,7,34,67,69};
		int[] array2 = new int[array1.length];
		
		//copying entire array1 to array2
		System.arraycopy(array1, 0, array2, 0,array1.length);  
		System.out.println(Arrays.toString(array2));
		
		int[] array3 = new int[array1.length];   
		System.arraycopy(array1, 2, array3, 1, 4);   //2 is from which index in first array you want to copy. 1 is in destination array from which index you want to place. 4 specifies how many elements you want from array1 to copy.
		System.out.println(Arrays.toString(array3));

		System.out.println("------------------COPYING ARRAYS USING COPYOFRANGEMETHOD--------------"); 
		
		int[] arr1 = {34,78,90,1,2,45,67,23,46};
		
		//entire array copy
		int[] arr2 = Arrays.copyOfRange(arr1, 0, arr1.length);
		System.out.println(Arrays.toString(arr2));

		//copying arr1 from specific index to specific index
		int[] arr3 = Arrays.copyOfRange(arr1, 2, 5);  //from index 2 to 4 will copied.(5 excluded)
		System.out.println(Arrays.toString(arr3));
	}
		
}