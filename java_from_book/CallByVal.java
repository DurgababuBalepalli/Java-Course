//using call by value in one class.
class Hello{
	int a = 10;
	public void meth(int a){
      a = a + 10;
      //return a;
	}

	public static void main(String[] args) {
	Hello hh = new Hello();
	System.out.println(hh.a);
	hh.meth(5);
    System.out.println(hh.a);
	//int result = hh.meth(5);
	//System.out.println(result);
}
}