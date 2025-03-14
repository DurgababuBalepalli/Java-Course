package stringsPractice;

/*
public class Hello 
{
	public static void main(String[] args) 
	{
		String company = "Ramer";
		boolean b1 = company instanceof String;
		System.out.println(b1);
		
		Hello obj = new Hello();
		boolean b2 = obj instanceof Hello;
		System.out.println(b2);
	}
}
*/

//in inheritance
/*
class Keyboard
{
	
}
class Dell extends Keyboard
{
	
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Dell obj = new Dell();
		boolean b1 = obj instanceof Dell;  //obj is instance of subclass
		System.out.println(b1);   //true
		
		boolean b2 = obj instanceof Keyboard;  //obj also instance to super class
		System.out.println(b2);
		
		//now lets check with super class
		Keyboard kb = new Keyboard();
		boolean b3 = kb instanceof Dell;
		System.out.println(b3);    //false
	}
}
*/

//in interfaces
interface Clock
{
	
}
class WallClock implements Clock
{
	
}
public class Hello {

	public static void main(String[] args) {
		WallClock wc = new WallClock();
		boolean b1 = wc instanceof WallClock;
		System.out.println(b1);  //true
	}

}