abstract class Book
{
	public void classmate()
	{
		System.out.println("iam classmate book");
	}
}
class Book1 extends Book
{
	public void childMeth()
	{
		System.out.println("iam child class");
	}
}
public class Tk057AbstractClassAndMethod {

	public static void main(String[] args) {
		Book1 obj = new Book1();
		obj.classmate();

	}

}
