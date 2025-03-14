class Durga{
	static void hel(int age){
		if(age<18){
			throw new ArithmeticException("notvalid");
		}
		else {
			System.out.println("eligible");
		}
	}
	public static void main(String[] args) {
		hel(4);
	}
}