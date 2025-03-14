//yoiu cannot access private variable
class Hell
{
	private int a = 20;
}
class Fine
{
	public static void main(String[] args) 
	{
		Hell obj = new Hell();
		System.out.print(obj.a);
	}
}