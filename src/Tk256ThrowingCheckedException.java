import java.io.IOException;

public class Tk256ThrowingCheckedException {
	public static void meth() throws IOException
	{
		throw new IOException("File is not found!! check once");
	}

	public static void main(String[] args) {
		try
		{
			meth();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
