//method overloading with automatic conversion
class Durga{
	void meth(){
     System.out.println("you are not passed any parameters");
	}

	void meth(int a,int b){
    System.out.println("a and b : " + a + " " +b);
	}

	double meth(double a){      //double receive integer value. so integer converted to double.
		return a * a;
	}
}
class Fin{
	public static void main(String[] args) {
		Durga dd = new Durga();
		dd.meth(5,6);
		double result = dd.meth(7);  //here passing integer value
		System.out.println(result);
	}
}
