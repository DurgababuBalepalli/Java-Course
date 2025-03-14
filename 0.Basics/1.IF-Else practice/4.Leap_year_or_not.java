import java.util.*;
class Leap_year
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int year = obj.nextInt();
		if (year%4==0) 
		{
			System.out.println(year+" is leap year");
		}
		else
			System.out.println("not leap year");
	}
}