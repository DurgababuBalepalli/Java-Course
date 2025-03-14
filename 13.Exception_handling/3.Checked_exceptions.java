package com.durga;
import java.io.BufferedReader;  //Reads text from a character-input stream, buffering characters so as toprovide for the efficient reading of characters, arrays, and lines. 
import java.io.IOException;
import java.io.InputStreamReader;   //It reads bytes and decodes them into characters

/*public class Hello
{
	public static void main(String[] args)
	{
		    String i;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
			i = br.readLine();  //readline reads a line of text.
			System.out.print(i);
	}
} */
//if you run the program you will get Unhandled exception type IOException.because your compilers knows about this checked exception
//you can handle this exception by using 'throws Exception' or try catch block
/*public class Hello
{
	public static void main(String[] args) throws Exception
	{
		    String i;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
			i = br.readLine();  //readline reads a line of text.
			System.out.print(i);
	}
} */

//using try-catch
public class Hello
{
	public static void main(String[] args) throws Exception
	{
		    int i = 0;   //initially iam taking i is 0.because i don't know which input user give.
			BufferedReader br = null;   //initially iam making buffer obj is null,later i will create obj.
			try
			{
				br = new BufferedReader(new InputStreamReader(System.in));  
				i = Integer.parseInt(br.readLine());  //iam converting to integer
			}
			catch(IOException e)
			{
				System.out.print(e);
			}
			finally
			{
				br.close();  //close itself also throwing exception,so again you can write try-catch but lengthy.so just add throws IOException to Method.
			}
				
	}
}
//Buffer reader br is resource.any classes which come with io those are resources.once you use resource you haveto
// close it.otherwise it will occupy your memory.suppose if you write br.close() in try.if exception occur at i,the resource
// will not be closed. so always put resource closing at finally block
