class Durga{
	public void num(int i){           //instead of writing two methods i will write in one method
		System.out.println(i);        //public void num(Number i){
	}                                 //      System.out.println(i);        Number datatype accepts both int and double
	public void num(double i){
		System.out.println(i);
	}
}
class Babu{
	public static void main(String[] args) {
		Durga obj = new Durga();
		obj.num(5.5);
	}
}
