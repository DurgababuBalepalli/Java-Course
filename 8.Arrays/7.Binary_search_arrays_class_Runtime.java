import java.util.*;
class Binary
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int[] numbers = new int[7];
		int i;
		for (i=0 ;i<numbers.length ;i++ ) 
		{
			 numbers[i]= obj.nextInt();
		}
		Arrays.sort(numbers);
		System.out.println("enter element to search : ");
		int search_key = obj.nextInt();
		System.out.println("your search_key present at index :");
		System.out.println(Arrays.binarySearch(numbers,search_key));
	}
}