/*
class Laptop
{
	
	String model;

	public Laptop(String model) 
	{
		this.model = model;
	}

	static class UsbPorts
	{
		int left = 2;
		int right = 3;
		public int totalports()
		{
			if(Laptop.this.model.equals("Msi")) //ypu will get error No enclosing instance of the type Laptop is accessible 
				                               //in scope
			{
				return 4;
			}
			else
			{
				return left+right;
			}
		}
	}

}
public class Tk089AccessingMembersOfOuterClassInsideStaticInnerClass {

	public static void main(String[] args) {
		Laptop.UsbPorts obj = new Laptop.UsbPorts();

	}

}
*/
