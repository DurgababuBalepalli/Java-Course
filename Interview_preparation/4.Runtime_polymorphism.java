class Peacock
{
	void meth()
	{
		System.out.println("hey iam peacock");
	}
}
class Parrot extends Peacock
{
	void meth()
	{
		System.out.println("iam from Parrot");
	}
}
class Fine
{
	public static void main(String[] args) {
		Peacock obj = new Parrot();
		obj.meth(); 
	}
}