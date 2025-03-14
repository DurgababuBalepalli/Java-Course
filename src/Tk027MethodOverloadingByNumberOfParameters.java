

class Hey
{
	public void meth(int i,int j)
	{
		System.out.print("i and j additon : "+(i+j));
	}
	public void meth(int i)
	{
		System.out.print("int value is : "+i);
	}
}

public class Tk027MethodOverloadingByNumberOfParameters {

	public static void main(String[] args) {

		Hey obj = new Hey();
		obj.meth(7,6);

	}

}
