//this is what we are doing till now.we are taking unnecessary class to get interface method.
/*
interface Purse
{
	default void show()
	{
		System.out.print("iam default method,if you want to access me implement another class");
	}
}
class Hundred implements Purse
{
	
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse obj = new Hundred();
		obj.show();
	}
}
*/

//so in java 1.8 static methods are introduced
interface Purse
{
	static void show()
	{
		System.out.print("no class required iam static");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse.show();
	}
}

//variable in interface
interface Purse
{
	int i = 10;   //by default it take final even you don't define
}
class Hundred implements Purse
{
	
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse obj = new Hundred();
		System.out.print(obj.i);    //see you can't able to modify it.
	}
}