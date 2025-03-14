import java.util.Scanner;

public class Tk002RangeOfPrimeNumbers {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a RangeOfNumber : ");
		int givenrange = obj.nextInt();
		int i,j;
		for(j=1;j<givenrange;j++)
		{

			int count = 0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count = count + 1;
				}
			}
			if(count==2)
			{
				System.out.println("PrimeNumber :"+j);
			}
			else
			{
				System.out.println("NotPrime");
			}

		}

	}

}
