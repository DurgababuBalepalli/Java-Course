abstract class Dianosour
{
	abstract void meth();
}
class Dog extends Dianosour
{
	void meth()
	{
		System.out.println("i will dog");
	}
}
class Heel
{
	public static void main(String[] args) {
		Dog dd = new Dog();
		dd.meth();
	}
}