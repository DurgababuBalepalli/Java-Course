/*public class Hello
{
	public static void main(String[] args)
	{
		int i = 5;
		int j = 7;
		try
		{
			int k = i/j;
			System.out.println(k);   //here k value is zero.so iam saying that if k==0 then print the exception present in catch block
			if(k==0)
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.println("can't devide with zero");
		}
	}
} */
//my main aim is to create an exception 
public class Hello
{
	public static void main(String[] args)
	{
		int i = 5;
		int j = 7;
		try
		{
			int k = i/j;
			if(k==0)
			{
				throw new DurgaException("out put is zero");     //here you should create DurgaException class
			}
		}
		catch(DurgaException e)
		{
			System.out.println(e.getMessage());
		}
	}
}


//DurgaException class

public class DurgaException extends Exception
{
	DurgaException(String s)
	{
		super(s);   //it will call Exception.from exception it will go to Thowable class Detailmessage
	}
}


//see this program also
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

//see this program also
package stringsPractice;

import java.util.TreeSet;

class ForException
{
	public int[] array = new int[10];
	public void meth()
	{
		try
		{
			array[11] = 12;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error is: "+e);
		}
	}
}
class Hello {
	public static void main(String[] args)
	{
		ForException obj = new ForException();
		obj.meth();
	}
}
