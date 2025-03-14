class Override
{
	public void meth(int a)
	{
		System.out.println("iam from Override class :"+a);
	}
}
class Overriding  extends Override
{
	public void meth(String s)
	{
		System.out.println("iam from 2nd class :"+s);
	}
}
class Finnel
{
	public static void main(String[] args) {
		Overriding orr = new Overriding();
		orr.meth(5);
	}
}