class calculater
{
	int num1;
	int num2;
	int result;
	public void reobject()

	{
       result = num1 + num2;
	}
}
class durga
{
	public static void main(String[] args) 
	{
		 calculater obj = new calculater();
		 obj.num1 = 5;
		 obj.num2 =6;
		 obj.reobject();
		 System.out.println(obj.result);
	}
}
