class A {
	public void durga(){
		System.out.println("Hello");
	}
}
class B extends A {
	public void durga(){
		//super.durga();	//here super calling class A object
		System.out.println("Hai");
	}
}
class Metover {
	public static void main(String[] args) {
		B obj = new B();
		obj.durga();
	}
}