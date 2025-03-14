import java.util.*;
class Divisible_5_11
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		if(number%5==0 && number%11==0)
		{
			System.out.println(number+"Divisible by 5 and 11");
		}
		else
		{
			System.out.println("not divisible");
		}
	}
}