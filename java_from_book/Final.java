//using final keyword to variable
/* class A{
	final int age = 10;
	public A(){
		age = 15;
	}
}
class Final{
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.age);
	}
} */
//using final keyword to class
/* final class A{
	public void durga(){
		System.out.println("hello");
	}
}
class B extends A {
    public void durga(){
    System.out.println("hey");
}
}
class Final{
	public static void main(String[] args) {
		B obj = new B();
		obj.durga();
	}
} */
//using final to method
/* final class A{
	public final void durga(){
		System.out.println("hello");
	}
}
class B extends A {
    public void durga(){
    System.out.println("hey");
}
}
class Final{
	public static void main(String[] args) {
		B obj = new B();
		obj.durga();
	}
} */