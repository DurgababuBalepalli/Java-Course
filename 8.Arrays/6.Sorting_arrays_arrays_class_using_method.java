import java.util.*;
class Sort_meth
{
	public static void sorting_meth(int[] a)
	{
		Arrays.sort(a);
		for (int x : a) 
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		int[] array = {4,3,8,1,9,4,2};
		sorting_meth(array);	
	}
}