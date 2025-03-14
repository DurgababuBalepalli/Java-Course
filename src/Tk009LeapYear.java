import java.util.Scanner;
/*
Leap Year contains 366 days, which comes once every four years. Every leap year corresponds to these facts : 

A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
A leap year (except a century year) can be identified if it is exactly divisible by 4.
A century year should be divisible by 4 and 100 both.
A non-century year should be divisible only by 4.
 */

public class Tk009LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Year : ");
		int year = sc.nextInt();
		
		if((year%400==0)&&(year%100!=0) || (year%4==0)&&(year%100!=0))  //1st condition check- It is century leap year
		{																// 2nd condition check- It is leap year and not century year
			System.out.println("it is leap Year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}

}
