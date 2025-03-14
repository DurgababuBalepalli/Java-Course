class Independent
{
	static int a = 10;		//static variable
	static void meth()
	{
		System.out.println("hey..hey");
	}
}
class Force
{
	public static void main(String[] args) 
	{
		System.out.print(Independent.a);
		Independent.meth();
	}
}