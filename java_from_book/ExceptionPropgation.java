class Durga{
	void A(){
     int data = 50/0;
	}
	void B(){
    A();
	}
	void C(){
		try{
			B();
		}
		catch(ArithmeticException e){
			System.out.println("Exception raised");
		}
	}
	public static void main(String[] args) {
		Durga hii = new Durga();
		hii.C();
	}
}