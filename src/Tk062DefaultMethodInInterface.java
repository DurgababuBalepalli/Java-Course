interface Wallet
{
	void show();
	default void extra() 
	{
		System.out.println("iam extra");
	}
}
class Thousand implements Wallet
{
	public void show()
	{
		System.out.println("iam Thousand");
	}
	public void extra()   //you can override interface default method()
	{
		System.out.println("i can override");
	}
}
public class Tk062DefaultMethodInInterface {

	public static void main(String[] args) {
		Thousand obj = new Thousand();
		obj.show();
		obj.extra();

	}

}
