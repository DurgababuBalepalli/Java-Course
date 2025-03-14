class Animal
{
	public void meth()
	{
		System.out.print("iam Animal");
	}
}
class Bat extends Animal
{
	@Override
	public void meth()
	{
		System.out.print("iam Bat");
	}
}
public class Tk066PolymorphicVariables {

	public static void main(String[] args) {
		Animal obj = new Bat();   //iam using reference of A. remember obj is matter for which class it is created
		obj.meth();    //you can call superclass reference as polymorphic variable

	}

}
