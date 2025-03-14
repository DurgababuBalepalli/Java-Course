

import java.util.Scanner;

class Fact
{
	public int meth(int number)
	{
		if(number>1)
		{
			return number*meth(number-1);
		}
		else
		{
			return 1;
		}
	}
}
public class Tk048FactorialOfNumberUsingRecursion {

	public static void main(String[] args) {
		Fact obj = new Fact();
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int result = obj.meth(number);
		System.out.println(result);

	}

}
