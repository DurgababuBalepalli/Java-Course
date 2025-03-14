//why abstract class
/*
class Cal
{
	public void show(int a)
	{
		System.out.print(a);
	}
	
	public void show(double a)
	{
		System.out.print(a);
	}
}

public class Hello
{
	public static void main(String[] args)
	{
		Cal obj = new Cal();
		obj.show(4);
	}
} */

//without overriding i can write using Number class.number class is an abstract class
class Cal
{
	public void show(Number a) //iam using Number class here
	{
		System.out.print(a);
	}
}

public class Hello
{
	public static void main(String[] args)
	{
		Cal obj = new Cal();
		obj.show(4.5);
	}
}