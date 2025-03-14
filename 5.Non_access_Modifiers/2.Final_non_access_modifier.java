class Rog
{
	final int a = 100;
	Rog()
	{
		a = 123;
	}
}
class Game
{
	public static void main(String[] args) 
	{
		Rog obj = new Rog();
		System.out.print(obj.a);
	}
}