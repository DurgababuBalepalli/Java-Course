class Fi
{
	final int a = 10;
	Fi(int value)
	{
		this.a = value;
	}
}
class May
{
	public static void main(String[] args) {
		Fi obj = new Fi(20);
		System.out.println(obj.a);
	}
}