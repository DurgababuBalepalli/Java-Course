
public class Tk254TryCatchFinallyBlock {

	public static void main(String[] args) {
		try
		{
			int k = 5/0;
		}
		catch(Exception e)
		{
			System.out.println("arthematic exception");
		}
		finally
		{
			System.out.println("iam always executed");
		}

	}

}
