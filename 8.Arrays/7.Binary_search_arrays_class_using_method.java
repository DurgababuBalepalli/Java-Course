import java.util.*;
class Binary_search_method
{
	public static void meth(int[] parameter)
	{
		Arrays.sort(parameter);
		int element = 41;
		System.out.println(Arrays.binarySearch(parameter,element));
	}
	public static void main(String[] args) {
		int[] array = {4,8,42,41,6,2,7};
		meth(array);
	}
}