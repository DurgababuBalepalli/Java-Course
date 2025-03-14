
public class Tk258CatchingBaseExceptionClassOnly {

	public static void main(String[] args) {
		try
		{
			int k = 5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
