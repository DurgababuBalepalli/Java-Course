class Lang
{
	public void sub()
	{
		System.out.println("common subject is english");
	}
}
class Java extends Lang
{
	@Override
	public void sub()
	{
		System.out.println("hey iam programming language");
	}
}
public class Tk064PolymorphismUsingMethodOverriding {

	public static void main(String[] args) {
		Java obj = new Java();
		obj.sub();
		
		Lang obj1 = new Lang();
		obj1.sub();

	}

}
