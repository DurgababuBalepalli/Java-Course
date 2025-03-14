class Max_of_two
{
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		if (a>b) 
		{
			System.out.println(a+" is grater");
		}
		else
		{
			System.out.println(b+" is grater");
		}

		//using methods
		Integer c = 20;
		Integer d = 30;
		Integer result = Integer.max(c,d);
		System.out.println(result);
	}
}