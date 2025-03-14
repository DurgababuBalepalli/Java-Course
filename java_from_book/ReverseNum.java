class Reverse{
	public static void main(String[] args) {
		int num = 254;
        int reverse = 0;
        int remainder;
		while (num!=0) {
			System.out.println("********");
			remainder = num % 10;
			num = num / 10 ;
			reverse = reverse * 10 + remainder;
			System.out.println(reverse);
		}
		
	}
}
//using for loop
class Reversefor{
	public static void main(String[] args) {
		int num = 254;
        int reverse = 0;
        int remainder;
		for (;num!=0 ; ) {
			System.out.println("********");
			remainder = num % 10;
			num = num / 10 ;
			reverse = reverse * 10 + remainder;
			System.out.println(reverse);
		}
	}
}