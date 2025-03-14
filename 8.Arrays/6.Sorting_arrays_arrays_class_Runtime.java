import java.util.*;
class Sorting_class
{
	public static void main(String[] args) {
		
		int[] array = new int[5];
		int i;
		Scanner obj = new Scanner(System.in);
		for (i=0;i<array.length ;i++ ) 
		{
			array[i] = obj.nextInt();
		}
		Arrays.sort(array);
		for (int x : array) 
		{
			System.out.println(x);
		}
	}
}