class Power{
	public static void main(String[] args) {
		int num = 2 ;
		int power = 5 ;
		int box = 1;
		for (int i=1;i<=power ;i++ ) {
			System.out.println("*******");
			box = box * num ;
			System.out.println(box);
		}
	}
}