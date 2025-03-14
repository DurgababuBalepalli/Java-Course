import java.util.Scanner;

public class Tk007FactorialOfNumber {

	public static void main(String[] args) {
		int i,factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int number = sc.nextInt();
		
		for(i=1;i<=number;i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println("Factorial is : "+factorial);
	}

}
