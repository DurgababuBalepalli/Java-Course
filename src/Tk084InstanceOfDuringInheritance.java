class Keyboard
{
	
}
class Dell extends Keyboard
{
	
}
public class Tk084InstanceOfDuringInheritance {

	public static void main(String[] args) {
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
