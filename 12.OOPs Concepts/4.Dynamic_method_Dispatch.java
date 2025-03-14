//using super class reference to subclass obj is dynamic method dispatch.but remember parent class and child class 
//must have the same method.other wise it won't work.we are assinging obj at runtime so it is runtime polymorphism
//due to runtime polymorphism dynamic method dispatch is happening
/*
class A
{
	public void meth()
	{
		System.out.print("iam A");
	}
}
class B extends A
{
	@Override
	public void meth()
	{
		System.out.print("iam B");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj = new B();   //iam using reference of A. remember obj is matter for which class it is created
		obj.meth();
	}
} */

//you can't override if the child's method not found in parent class
class A
{
	public void meth()
	{
		System.out.print("iam A");
	}
}
class B extends A
{
	@Override
	public void meth()
	{
		System.out.print("in B");
	}
	public void fool()
	{
		System.out.print("iam only belongs to class B.so super class reference cannot access me");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj  = new B();
		obj.fool();  //you can see error method fool is underfined for class A
	}
}