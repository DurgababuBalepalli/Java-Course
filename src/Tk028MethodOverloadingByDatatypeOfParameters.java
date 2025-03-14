

class Hell
{
	public void meth(int i)
	{
		System.out.print("i value is: "+i);
	}
	public void meth(String s)
	{
		System.out.print("String is : "+s);
	}
}

public class Tk028MethodOverloadingByDatatypeOfParameters {

	public static void main(String[] args) {
		Hell obj = new Hell();
		obj.meth("durga");

	}

}
