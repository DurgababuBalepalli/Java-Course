//multiple inheritance issue with interfaces
/*
interface Purse
{
	void show();
	default void extra()
	{
		System.out.println("Purse extra");
	}
}
interface Wallet
{
	default void extra()
	{
		System.out.print("wallet extra");
	}
}
class Hundred implements Purse,Wallet  //you will get Duplicate default methods named extra with the parameters () and () are inherited from the types Wallet and Purse
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
		
		obj.extra();
	}
} */

//so in interfaces also multiple inheritance problem is present.we can solve this by overriding the default method
//multiple inheritance issue with interfaces
interface Purse
{
	default void extra()
	{
		System.out.println("Purse extra");
	}
}
interface Wallet
{
	default void extra()
	{
		System.out.print("wallet extra");
	}
}
class Hundred implements Purse,Wallet  //you will get Duplicate default methods named extra with the parameters () and () are inherited from the types Wallet and Purse
{

	@Override
	public void extra() {
		// TODO Auto-generated method stub
		Purse.super.extra();    //if you change Wallet,extra method of Wallet will displayed
	}
	
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse obj = new Hundred();
		
		obj.extra();
	}
}