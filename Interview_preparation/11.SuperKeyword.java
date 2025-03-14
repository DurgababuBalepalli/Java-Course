class Hey
{
	public void meth()
	{
		System.out.println("iam method 1");
	}
}
class Hi extends Hey
{
	public void meth()
	{
		super.meth();
		System.out.println("iam method 2");
	}
}
class Finnel
{
	public static void main(String[] args) {
		Hi obj = new Hi();
		obj.meth();
	}
}