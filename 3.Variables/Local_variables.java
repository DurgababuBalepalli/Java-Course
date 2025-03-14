import java.util.*;
class Hello
{
	public void meth()
	{
		int b = 30;
		System.out.print("b is :"+b);
	}
}
class Full
{
	public static void main(String[] args) 
	{
		Hello obj = new Hello();
		obj.meth();
	}
}