

class Cat
{
	public void eat()
	{
		System.out.println("i will eat cat");
	}
}
class Dog extends Cat
{
	@Override
	public void eat()
	{
		System.out.println("i will eat cat");
	}
	
	public void bark()
	{
		System.out.println(" i can bark ");
	}
}
public class Tk050MethodOverridingInInheritance {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();   //child class method overrides parent. so child class method will be printed
		obj.bark();
	}

}
