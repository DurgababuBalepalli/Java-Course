
class Goal
{
	final public void meth()       //
	{
		System.out.print("Hello");
	}
}
class Gun extends Goal
{
	//public void meth()   //error - cannotoverride final method
	{
		System.out.print("Hai");
	}
}
public class Tk046FinalMethod {

	public static void main(String[] args) {
		Gun obj = new Gun();
		obj.meth();
	}

}
