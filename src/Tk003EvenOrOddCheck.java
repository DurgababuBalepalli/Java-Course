import java.util.Scanner;

public class Tk003EvenOrOddCheck 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int number  = sc.nextInt();
	
		if(number%2==0)
		{
			System.out.println("EvenNumber");
		}
		else
		{
			System.out.println("OddNumber");
		}
	}
}
