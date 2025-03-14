import java.util.*;
class Day_of_week
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int day = obj.nextInt();
		if (day==1) 
		{
			System.out.println("Sunday");
		}
		else if (day==2) 
		{
			System.out.println("Monday");
		}
		else if (day==3) 
		{
			System.out.println("Tuesday");
		}
		else if (day==4) 
		{
			System.out.println("wed");
		}
		else if (day==5) 
		{
			System.out.println("Thurs");
		}
		else if(day==6)
		{
			System.out.println("Fri");
		}
		else if (day==7) 
		{
			System.out.println("Sat");
		}
	}
}