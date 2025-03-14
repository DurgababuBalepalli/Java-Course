import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tk260TryWithResources {

	public static void main(String[] args) {
		String name;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Durgababu\\Desktop\\prr.txt"));
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

	}

}
