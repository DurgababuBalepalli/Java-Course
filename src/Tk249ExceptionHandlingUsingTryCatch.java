
public class Tk249ExceptionHandlingUsingTryCatch {

	public static void main(String[] args) {
		try
		{
			int k = 5/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());  //if you want only error message
		}
	}

}
