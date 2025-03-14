//generally how we override methods
/*
class A
{
	public void meth()
	{
		System.out.print("hello");
	}
}
class B extends A
{
	public void meth()
	{
		System.out.print("hai");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.meth();
	}
} */

/*
//for one time use do i need to write class B?  no so iam go for anonymous class
class A
{
	public void meth()
	{
		System.out.print("hello");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj = new A()
				{
					public void meth()
					{
						System.out.print("hai");
					}
				};
		obj.meth();
	}
}
*/

//Annonymous class for interfaces
interface Purse
{
	public void show();
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse obj = new Purse()
				{
					public void show()
					{
						System.out.print("Hai");
					}
				};
		obj.show();
	}
}
