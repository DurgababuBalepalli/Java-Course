import java.util.*;
class Max_3
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int number1 = obj.nextInt();
		int number2 = obj.nextInt();
		int number3 = obj.nextInt();

		if (number1>number2 && number1>number3)
		{
			System.out.println(number1);
		}
		else if (number2>number1 && number2>number3) 
		{
			System.out.println(number2);
		}
		else
		{
			System.out.println(number3);
		}
	}
}