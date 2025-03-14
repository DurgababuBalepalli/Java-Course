import java.util.Scanner;
class Hey
{	
	void meth()
	{
		int[] myarray = {1,2,7,5,32}; 
		for (int i=1;i<myarray.length;i+=2 ) 
		{
			System.out.println(myarray[i]);
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