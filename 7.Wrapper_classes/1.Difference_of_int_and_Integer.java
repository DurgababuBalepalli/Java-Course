class Hello
{
	public static void main(String[] args) {
		//int a = "123";    //not poassible ERROR : incompatible types: String cannot be converted to int
		//int a = (int)"123"; ////not poassible ERROR : incompatible types: String cannot be converted to int

		//but possible with Integer
		Integer a = Integer.parseInt("123");
		System.out.print(a);

		//you can do conversion b/w number systems easily
		String b = Integer.toBinaryString(123);    //you can use any number system you want
		System.out.println(b);
	}
}