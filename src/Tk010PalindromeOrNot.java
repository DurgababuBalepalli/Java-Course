import java.util.Scanner;

public class Tk010PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();

		int rev = 0;
		int remainder;
		int palin = number; 
		while(number>0)
		{
			remainder = number%10;
			rev = rev * 10 + remainder;
			number = number/10;
		}
		//System.out.println(rev);
        if(rev==palin)
        {
        	System.out.println("it is palindrome");
        }
        else
        {
        	System.out.println("not palindrome");
        }
	}

}
