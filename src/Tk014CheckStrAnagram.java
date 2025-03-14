import java.util.Arrays;

//We can say if two strings are an anagram of each other if they contain the same characters but at different orders.
//Ex. army & mary
public class Tk014CheckStrAnagram {

	public static void main(String[] args) {
		String s1 = "army";
		String s2 = "Mary";
		
		char[] stringCharArray1 = s1.toLowerCase().toCharArray();  //iam changing to lowercase and converting to character array to compare
		char[] stringCharArray2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(stringCharArray1);
		Arrays.sort(stringCharArray2);
		
		boolean result  = Arrays.equals(stringCharArray1, stringCharArray2);
		System.out.println(result);
	}

}
