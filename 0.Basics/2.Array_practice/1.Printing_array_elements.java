import java.util.Scanner;
class Hey
{	
	void meth()
	{
		int[] myarray = {1,2,7,5,32};
		for (int i : myarray)
		{
			System.out.println(i);
		}
	}
}
class Hello
{
	public static void main(String[] args) {
		Hey hh = new Hey();
		hh.meth();
	}
}