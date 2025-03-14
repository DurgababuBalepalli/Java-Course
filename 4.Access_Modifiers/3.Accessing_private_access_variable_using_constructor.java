class Help
{
	private int a;
	Help(int a)
	{
		this.a = a;
		System.out.print(a);
	}
}
class Feel
{
	public static void main(String[] args) 
	{
		Help obj = new Help(6);
	}
}