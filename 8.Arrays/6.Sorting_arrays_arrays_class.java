import java.util.Arrays;
class Array_class
{
	public static void main(String[] args) {
		int[] numbers = {4,8,2,9,5,4};
		Arrays.sort(numbers);
		for (int x :numbers) 
		{
			System.out.println(x);
		}
		//characters
		char[] alphabets = {'a','A','d','Z','D'}; //AscII values of capital letters are less than the small letters.so A,D,Z,a,d is sorted array.
		Arrays.sort(alphabets);
		for (char x :alphabets ) 
		{
			System.out.println(x);
		}
	}
}