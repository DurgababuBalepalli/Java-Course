class Fact{
	public static void main(String[] args) {
		int i;
		int fact = 1;
		for (i=1;i<=5 ;i++ ) {
			System.out.println("********");
			fact = fact * i;
            System.out.println("factorial is" +fact);
		}
	}
}