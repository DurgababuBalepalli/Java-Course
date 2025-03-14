

class Overload
{
	public Overload(int i)
	{
		System.out.print("this constructor taking i value "+i);
	}
	public Overload(double j,double k)
	{
		System.out.print("addition of J and K : "+(j+k));
	}
}

public class Tk035ConstructorOverloading {

	public static void main(String[] args) {
		new Overload(4);

	}

}
