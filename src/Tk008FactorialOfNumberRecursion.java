import java.util.Scanner;

class Hello
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

public class Tk008FactorialOfNumberRecursion {

	public static void main(String[] args) {
		
		Hello obj = new Hello();
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int result = obj.meth(number);
		System.out.println(result);

	}

}
