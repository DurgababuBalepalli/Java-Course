import java.util.*;
class Equals_using_meth
{
	public static void equals_method(int[] a,int[] b)
	{
		System.out.println(Arrays.equals(a,b));
	}
	public static void main(String[] args) {
		int[] array1 = {1,4,3};
		int[] array2 = {1,4,3};
		equals_method(array1,array2);	
	}
}