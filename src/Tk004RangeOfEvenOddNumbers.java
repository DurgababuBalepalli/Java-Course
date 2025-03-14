import java.util.Scanner;

public class Tk004RangeOfEvenOddNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Range :");
		int givenrange  = sc.nextInt();
		
		int i;
		for(i=0;i<=givenrange;i++)
		{
			if(i%2==0)
			{
				System.out.println("EvenNumber :"+i);
			}
			else
			{
				System.out.println("OddNumber");
			}
		}
	}

}
