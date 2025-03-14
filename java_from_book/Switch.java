import java.util.*;
class Switex{
	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
    switch(month){
    	case 1 : System.out.println("january");
    	         break;
    	case 2 : System.out.println("february");
    	         break;
    	case 3 : System.out.println("march");
    	         break;
    	case 4 : System.out.println("april");
    	         break;
    	case 5 : System.out.println("may");
    	         break;
        case 6 : System.out.println("june");
    	         break;
    	case 7 : System.out.println("july");
    	         break;
    	default : System.out.println("invalid");
    	         break;
    }
	}
}