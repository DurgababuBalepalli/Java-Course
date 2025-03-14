import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Tk262TryWithMultipleResources {

	public static void main(String[] args) throws FileNotFoundException {
		String name;
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Durgababu\\Desktop\\prr.txt")))
		{
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

/*
public class Tk262TryWithMultipleResources {

	public static void main(String[] args) throws FileNotFoundException {
		try(Scanner sc = new Scanner(new File("C:\\Users\\Durgababu\\Desktop\\prr.txt")); //iam reading here
			PrintWriter pr = new PrintWriter(new File("C:\\Users\\Durgababu\\Desktop\\prr1.txt")) ) //writing here)
		{
			
			while(sc.hasNext())
			{
				pr.print(sc.nextLine());
			}
		}
		finally
		{
			System.out.println("done");
		}
	}

} */