class Pink
{
	void meth()
	{
		System.out.println("hello every one");
	}
}
class Ponk extends Pink
{
	void meth1()
	{
		System.out.println("iam ponk");
	}
}
class Hey
{
	public static void main(String[] args) {
		Ponk obj = new Ponk();
		obj.meth1();

	}
}