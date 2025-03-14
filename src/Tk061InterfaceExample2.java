interface Language
{
	public void introduce(); //whatever method you define by default it is abstract
}
class Telugu implements Language
{
	@Override
	public void introduce()
	{
		System.out.println("hey....iam telugu");
	}	
}
class English implements Language
{
	@Override
	public void introduce() 
	{
		System.out.println("hey.....iam english");
	}
	
}
public class Tk061InterfaceExample2 {

	public static void main(String[] args) {
		Telugu obj = new Telugu();
		obj.introduce();

	}

}
