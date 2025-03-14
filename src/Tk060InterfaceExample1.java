interface Purse
{
	void show();  //by default all methods are abstract methods
}
class Hundreds implements Purse
{
	public void show()
	{
		System.out.print("200");
	}
}
public class Tk060InterfaceExample1 {

	public static void main(String[] args) {
		Hundreds obj = new Hundreds();  //it is same like abstraction
		//you can use dynamic method dispatch.Purse obj = new Hundreds()
		obj.show();

	}

}
