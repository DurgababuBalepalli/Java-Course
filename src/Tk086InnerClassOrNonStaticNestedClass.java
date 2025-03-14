
class Fruits          //treat Apple,Orange classes as Fruit class members
{
	//nested class
	class Apple
	{
		int quantity()
		{
			return 100;
		}
	}
	
	//protected nested class
	protected class Orange
	{
		int quantity()
		{
			return 200;
		}
	}
}
public class Tk086InnerClassOrNonStaticNestedClass {

	public static void main(String[] args) {
		Fruits obj = new Fruits();  //object to the outer class
		Fruits.Apple appleclassobj = obj.new Apple();   //for apple class
		System.out.println(appleclassobj.quantity());
		
		Fruits.Orange orangeclassobj = obj.new Orange();   //for orange class
		System.out.println(orangeclassobj.quantity());

	}

}
