import java.util.Scanner;

public class Hello
{
	public static void main(String[] args)
	{
		String input = "N160127@gmail.com";
		boolean b = input.endsWith("@gmail.com");
		if(b == true)
		{
			System.out.println("your mail is valid");
		}
		else
		{
			System.out.println("your email is invalid");
		}
	}
}