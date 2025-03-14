class Try{
	public static void main(String[] args) 
	{
		int a=6;
		int b=1; int c=1;
		int x;
		int y;
	
	try  {
          x = a/(b-c);
	}
	catch(ArithmeticException e){
      System.out.println("not devided by zero");
	}
	y=a/(b+c);
	System.out.println(y);
	
}
}