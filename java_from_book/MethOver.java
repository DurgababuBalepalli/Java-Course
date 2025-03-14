//method overloading
class Durga{
	void meth(){
     System.out.println("you are not passed any parameters");
	}

	void meth(int a,int b){
    System.out.println("a and b : " + a + " " +b);
	}

	double meth(double a){
		return a * a;
	}
}
class Fin{
	public static void main(String[] args) {
		Durga dd = new Durga();
		dd.meth(5,6);
		double result = dd.meth(7.5);
		System.out.println(result);
	}
}
