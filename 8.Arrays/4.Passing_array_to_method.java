class Pass_arrayto_method
{
	public static void meth(int[] parameter)
	{
		int i;
		for (i = 0; i<parameter.length ;i++ ) 
		{
			System.out.println(parameter[i]);
		}

		//uding for each loop
		System.out.println("----------------------------------------------");
		for (int x : parameter) 
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		                                                           //if you dont use static method : Pass_arrayto_method ps = new Pass_arrayto_method();
		int[] array = {1,3,5,7,9};
		meth(array);
	}
}