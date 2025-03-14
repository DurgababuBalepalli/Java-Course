abstract class Super_class
{
	abstract void method();
}
class Subclass extends Super_class
{
	void method()
	{
		System.out.print("hey..iam repalcing abstract method");
	}
}
class Total
{
	public static void main(String[] args) {
		Subclass obj = new Subclass();
		obj.method();
	}
}