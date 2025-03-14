//whenever you create an obj to the sub class(which is extending parent class),the constructor of superclass called first and then constructor of subclass is called.simply remember whenever you call subclass,super class also called.
/* class A   
{
	public A()
	{
		System.out.println("hey hello iam from class A");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("hello iam from B");
	}
}
class Hello
{
	public static void main(String[] args)
	{
		B obj = new B();
	}
}  */

//whenever you have constructors with same parameter specified child class(here B) constructor will be called
// and Default constructor of Super class will be called
/* class A   
{
	public A()
	{
		System.out.println("iam A");
	}
	public A(int a)
	{
		System.out.println("hey hello iam from class A");
	}
}
class B extends A
{
	public B()
	{
		 //by default super() is there.so it will call parent class
		System.out.println("iam B");
	}
	public B(int a)
	{
		System.out.println("hello iam from B");
	}
}
class Hello
{
	public static void main(String[] args)
	{
		B obj = new B(5);
	}
} */

//why this is happening? by default for constructors super will be there in child classes.if you want to call
// parametrazed constructor of super class user super(parameter)
class A   
{
	public A()
	{
		System.out.println("iam A");
	}
	public A(int a)
	{
		System.out.println("hello iam from class A");
	}
}
class B extends A
{
	public B()
	{
		 //by default super() is there.so it will call parent class
		System.out.println("iam B");
	}
	public B(int a)
	{
		super(a);
		System.out.println("hello iam from B");
	}
}
class Hello
{
	public static void main(String[] args)
	{
		B obj = new B(5);
	}
}

/*  you can pass values to parent class
class A   
{
	int i;
}
class B extends A
{
	public B()
	{
		super.i = 20;
	}
}
class Hello
{
	public static void main(String[] args)
	{
		B obj = new B();
		System.out.print(obj.i);
	}
}
*/