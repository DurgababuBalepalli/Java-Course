
public class Tk253TryFinallyBlock {

	public static void main(String[] args) {
		try
		{
			int k = 5/0;
		}
		finally
		{
			System.out.println("iam always executed");
		}

	}

}
