class Hai{
	static int a = 10;
	static int b = 20; 
}
class Hello{
	public static void main(String[] args) {  // here no allocation so no copy made.
		System.out.println(Hai.a);
	}
}