import java.util.Scanner;

public class Tk001PrimeNumberCheck {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = obj.nextInt();
		
		int i,count = 0;
		for(i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count = count + 1;
			}
		}
		if(count==2)
		{
			System.out.println("PrimeNumber");
		}
		else
		{
			System.out.println("NotPrime");
		}
	}

}
