//using Access Specifiers
class Durga{
	int i;         //default
	public int j;  //public
	private int k; //private
	int meth(int d){
		 k = d;
		 return k;
	}
}
class Fin{
	public static void main(String[] args) {
		Durga dd = new Durga();
		
		int result1 = dd.i=10;
        System.out.println(result1);
        int result2 = dd.j=20;
        System.out.println(result2);
        int result3 = dd.meth(30);
        System.out.println(result3);
        // int rr = dd.k=30;
        // System.out.println(rr);    get error
	}
}