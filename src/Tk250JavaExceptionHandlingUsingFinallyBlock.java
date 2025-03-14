
public class Tk250JavaExceptionHandlingUsingFinallyBlock {

	public static void main(String[] args) {
		try
		{
			int k = 5/2;
			int myarray[] = {2,5,4};
			System.out.println(myarray[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("index out of bound");
		}
		finally
		{
			System.out.println("medical shop");
		}	

	}

}
