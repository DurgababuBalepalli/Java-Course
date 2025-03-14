
//If the string is similar from the starting as well as the ending, then we can say that the string is a palindrome.
//For example. madam, radar, etc.
public class Tk018PalindromeString {

	public static void main(String[] args) {
		String mystring = "madam";
		String reverseString = "";
		for(int i=mystring.length()-1 ;i>=0;i--)
		{
			//System.out.println(mystring.charAt(i));
			reverseString = reverseString + mystring.charAt(i);
		}
		//System.out.println(reverseString);
		//System.out.println(mystring);
		if(mystring.equals(reverseString))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
