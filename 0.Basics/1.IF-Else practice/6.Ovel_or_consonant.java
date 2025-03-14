import java.util.*;
class Ovel_consonant
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String alphabet = obj.next();
		if (alphabet=="a" || alphabet=="e" || alphabet=="i" || alphabet=="o" || alphabet=="u" ||
			alphabet=="A" || alphabet=="E" || alphabet=="I" || alphabet=="O" || alphabet=="U")
		{
			System.out.println("given is ovel");
		}
	}
}