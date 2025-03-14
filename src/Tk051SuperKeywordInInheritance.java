
class Fat
{
	public void eat()
	{
		System.out.println("hello");
	}
}
class Human extends Fat
{
	@Override
	public void eat()
	{
		super.eat();  //parent class eat method also called
		System.out.println("hai");
	}
}
public class Tk051SuperKeywordInInheritance {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.eat();   

	}

}
