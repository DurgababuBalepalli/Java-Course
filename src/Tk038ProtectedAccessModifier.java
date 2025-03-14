
//protected accessable within the package and outside the package through only inheritance.
class Protect
{
	protected void mymessage()  //this is protected method
	{
		System.out.println("hey this is protected method");
	}
}
public class Tk038ProtectedAccessModifier extends Protect {

	public static void main(String[] args) {
		Protect obj = new Protect();
		obj.mymessage();

	}

}
