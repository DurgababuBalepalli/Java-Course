
class Bottle
{
	public void water()
	{
		System.out.println("bottle gives water");
	}
}
class Bucket extends Bottle
{
	@Override
	public void water()
	{
		super.water();  //parent class eat method also called
		System.out.println("Bucket also gives water");
	}
}

public class Tk053SuperToCallSuperclassMethod {

	public static void main(String[] args) {
		Bucket obj = new Bucket();
		obj.water();  

	}

}
