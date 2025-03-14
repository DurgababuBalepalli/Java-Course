//Final Keyword
//if you give final to
// variable - no one can't modify.
// method - no one can override it
// class - no one can extend it

/*class A
{
	final int a;
	public A(int value)
	{
		a = value;
		//a = 40;  //now you can observe you can't modify
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj  = new A(3);
	}
} */

/*
final class A
{
	
}
class B extends A
{
	
}
public class Hello
{
	public static void main(String[] args)
	{
	    
	}
}
*/

class A
{
	public final void show()
	{
		System.out.print("hello");
	}
}
class B extends A
{
	public void show()    //you get error you can't override final method.
	{
		System.out.print("hey");
	}
}
