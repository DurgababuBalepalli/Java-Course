//method overloading
class Hey
{
	public void meth(int i,int j)
	{
		System.out.print("i and j additon : "+(i+j));
	}
	public void meth(double d)
	{
		System.out.print("double value is : "+d);
	}
}

public class Hello
{
	public static void main(String[] args)
	{
		Hey obj = new Hey();
		obj.meth(7.6);
	}
}

//constructor Overloading
class Hey
{
	public Hey(int i)
	{
		System.out.print("this constructor taking i value "+i);
	}
	public Hey(double j,double k)
	{
		System.out.print("addition of J and K : "+(j+k));
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		new Hey(4);
	}
}