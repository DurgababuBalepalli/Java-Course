import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tk261CloseResourceUsingFinallyBlock {

	public static void main(String[] args) throws IOException {
		String name;
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("C:\\Users\\Durgababu\\Desktop\\prr.txt"));
			;
			while((name = br.readLine())!=null)
			{
				System.out.println(name);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			br.close();
		}
	}

}
