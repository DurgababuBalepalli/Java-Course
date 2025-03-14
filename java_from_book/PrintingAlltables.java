class Table{
	public static void main(String[] args) {
		int i;
		int k;
		for (i=1;i<=5 ;i++ ) {
			System.out.println("*******");
			for (k=1;k<=10 ;k++) {
				System.out.println(i + "*" + k + "=" +(i*k));
			}
		}
		
	}
}