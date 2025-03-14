abstract class Human
{
	abstract public  void meth();
}
class Man extends Human
{
	public void meth()
	{
		System.out.print("iam man");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Human obj = new Man();
		obj.meth();
	}
}