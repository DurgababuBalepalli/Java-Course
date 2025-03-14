class A{
	public int add(int i, int j){
		return i + j;
	}
}
class B extends A {
	public int sub(int i, int j){
		return i - j;
	}
}
class C extends B {
	public int mul(int i, int j){
		return i * j;
	}
}
class Advcal extends C {
	public int div(int i,int j){
		return i / j;
	}
}
class calc{
	public static void main(String[] args) {
		Advcal obj = new Advcal();
		int result1 = obj.add(7,9);
		int result2 = obj.sub(9,2);
		int result3 = obj.mul(5,3);
		int result4 = obj.div(10,2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}