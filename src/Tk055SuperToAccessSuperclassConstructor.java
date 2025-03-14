class A   
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
		//super(); //bydefault super called.so both constructors are called.
		System.out.println("hello iam from B");
	}
}
public class Tk055SuperToAccessSuperclassConstructor {

	public static void main(String[] args) {
		B obj = new B();

	}

}
