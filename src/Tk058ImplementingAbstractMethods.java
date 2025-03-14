abstract class Pen
{
	abstract void blackpen();
	public void bluePen()
	{
		System.out.println("iam bluepen");
	}
}
class Pencil extends Pen
{
	public void blackpen()
	{
		System.out.println("i will override abstract method of blackpen");
	}
}
public class Tk058ImplementingAbstractMethods {

	public static void main(String[] args) {
		Pencil obj = new Pencil();
		obj.blackpen();
		
		obj.bluePen();

	}

}
