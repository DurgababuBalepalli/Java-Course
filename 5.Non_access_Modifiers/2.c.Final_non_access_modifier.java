final class Goal
{
	public void meth()       //
	{
		System.out.print("Hello");
	}
}
class Gun extends Goal
{
	public void meth()
	{
		System.out.print("Hai");
	}
}
class Hola
{
	public static void main(String[] args) 
	{
		Gun obj = new Gun();
		obj.meth();
	}
}