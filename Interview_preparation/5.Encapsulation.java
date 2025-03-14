class Encap
{
	private int roll = 20;
	public int meth()
	{
		return roll;
	}
}
class Hell
{
	public static void main(String[] args) {
		Encap obj = new Encap();
		int result = obj.meth();	
		System.out.println(result);
	}
}