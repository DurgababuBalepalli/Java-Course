abstract class Animal{
	public abstract void eat();
}
class Dog extends Animal{
	public void eat(){
		System.out.println("chicken");
	}
}
class Durga{
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.eat();
	}
}
