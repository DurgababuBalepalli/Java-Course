import java.util.*;
class Number_character
{
	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		char alphabet = myobj.next().charAt(0);   //remember youdont have nextChar.either you can use a String. i.e Strint str = myobj.next();
		if (alphabet>=97 && alphabet<=122 || alphabet>=65 && alphabet<=90) 
		{
			System.out.println("you have given character");
		}
		else
		{
			System.out.println("it is not character");
		}
	}
}