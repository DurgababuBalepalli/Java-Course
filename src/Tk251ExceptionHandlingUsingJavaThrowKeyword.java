
public class Tk251ExceptionHandlingUsingJavaThrowKeyword {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		try
		{
			int k = a/b;
			if(k==0)
			{
				throw new Exception();
			}
			System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println("not possible small number divisible by big");
		}

	}

} 
