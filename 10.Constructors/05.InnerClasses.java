/* class Outer
{
	public void show()
	{
		
	}
	class Inner           //member class.    //after compilation you get this with the file name Outer$inner.class. check this
	{
		public void meth()
		{
			System.out.print("iam inner class");
		}
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Outer obj = new Outer();
		Outer.Inner obj1 = obj.new Inner();
		obj1.meth();
	}
}  */

//if inside is static class then we dont need to use object of outer class
class Outer
{
	public void show()
	{
		
	}
	static class Inner          //static class
	{
		public void meth()
		{
			System.out.print("iam inner class");
		}
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Outer obj = new Outer();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.meth();
	}
}

//we have another class Annonymous class.