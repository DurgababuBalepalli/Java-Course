abstract class Hp
{
	abstract public void lappy();
}
class Acer extends Hp
{
	@Override
	public void lappy()
	{
		System.out.println("Acer laptop");
	}	
}
class Msi extends Hp
{
	@Override
	public void lappy() 
	{
		System.out.println("Msi Laptop");
	}	
}
public class Tk059Abstraction {

	public static void main(String[] args) {
		Msi obj = new Msi();
		obj.lappy();
		
		Acer obj1 = new Acer();
		obj1.lappy();
	}

}
