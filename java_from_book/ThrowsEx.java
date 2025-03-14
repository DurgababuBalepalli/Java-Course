class Durga{
	void A()throws InternalError{
     int data = 50/0;
     throw new InternalError("Device Error");
	}
	void B(){
    A();
	}
	void C(){
		try{
			B();
		}
		catch(ArithmeticException e){
			System.out.println("Exception NOT OCCUR");
		}
	}
	public static void main(String[] args) {
		Durga hii = new Durga();
		hii.C();
	}
}