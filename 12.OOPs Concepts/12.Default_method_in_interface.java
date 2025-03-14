/*
interface Purse
{
	void show();
	default void extra() 
	{
		System.out.println("iam extra");
	}
}
class Hundred implements Purse
{
	public void show()
	{
		System.out.println("iam hundred");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse obj = new Hundred();
		obj.show();
		obj.extra();
	}
} */

//can i acheive overriding? yes.
interface Purse
{
	void show();
	default void extra() 
	{
		System.out.println("iam extra");
	}
}
class Hundred implements Purse
{
	public void show()
	{
		System.out.println("iam hundred");
	}
	public void extra()
	{
		System.out.print("method overloading");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse obj = new Hundred();
		obj.show();
		obj.extra();
	}
}