abstract class Animal
{
	void general_method()
	{
		System.out.print("iam general method");
	}
}
class Dog extends Animal
{
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.general_method();
	}
}