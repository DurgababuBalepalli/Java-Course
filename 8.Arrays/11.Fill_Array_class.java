import java.util.*;
class Fill_array
{
	public static void main(String[] args) {
		int[] array = {1,4,3};
		Arrays.fill(array,2);    //remember you are filling entire array with 2.so output is {2,2,2s}
		for (int x :array ) 
		{
			System.out.println(x);
		}
	}
}