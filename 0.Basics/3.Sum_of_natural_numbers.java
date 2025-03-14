import java.util.Scanner;
class Hey
{	
	Scanner myscanner = new Scanner(System.in);
	int number = myscanner.nextInt();
	public void meth()
	{
		int sum  = 0;
		for (int i=1;i<number ;i++ ) 
		{
				sum = sum + i;
		}
		System.out.println(sum);
	}
}
class Hello
{
	public static void main(String[] args) {
		Hey hh = new Hey();
		hh.meth();
	}
}