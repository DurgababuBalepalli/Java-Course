class Durga{
	static int a = 10;    
	static int b;
	static void meth(int x){
	 System.out.println("x is: "+x);     
     System.out.println("b is: "+b);  
     System.out.println("a is: "+a); 
	}
	static{     //here static block initilize
		b = a * 10;
	}
}
class Hello{
	public static void main(String[] args) {
		Durga.meth(4);
		//System.out.println(Durga.b);
	}
}