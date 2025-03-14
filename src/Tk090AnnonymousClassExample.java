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
//for one time use do i need to write class B?  no so iam go for anonymous class
class AV 
{
	public void meth() 
	{
		System.out.print("hello");
	}
}

public class Tk090AnnonymousClassExample 
{

	public static void main(String[] args) 
	{
		AV obj = new AV() 
		{
			public void meth() 
			{
				System.out.print("hai");
			}
		};
		obj.meth();
	}

}
