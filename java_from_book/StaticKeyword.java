//using static method to variables,methods,block in a class(inside)
class Durga{
	static int a = 10;    //static variable
	static int b;
	static void meth(int x){     //static method
     System.out.println("x is: "+x);
     System.out.println("b is: "+b);  // static block directly called to this method
     System.out.println("b is: "+a); //here static method directly calls a variable
	}
	static{     //here static block initilize
		b = a * 10;
	}
	public static void main(String[] args) {
		meth(5);
	}
}