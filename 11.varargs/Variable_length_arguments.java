class A
{
	public int meth(int ...a)
	{
		int sum = 0;
		for(int i : a)
		{
			sum = sum + i;
		}
		return sum;
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj = new A();
		System.out.print(obj.meth(109));
	}
}