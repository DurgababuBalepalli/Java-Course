class Over
{
	public void meth(int a)
	{
		System.out.println("your interger :"+a);
	}
	public void meth(int a,int b)
	{
		System.out.println("your integers :"+a+b);
	}	
}
class Finel
{
	public static void main(String[] args) {
		Over ov = new Over();
		ov.meth(5,2);
	}
}