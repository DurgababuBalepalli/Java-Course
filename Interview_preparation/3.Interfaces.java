interface Bank
{
	public void meth();
}
class Yono implements Bank
{
	public void meth()
	{
		System.out.println("this is yono");
	}
}
class Andhra implements Bank
{
	public void meth()
	{
		System.out.println("it is Andhra");
	}
}
class Fine
{
	public static void main(String[] args) {
		Bank obj = new Andhra();
		obj.meth();
	}
}