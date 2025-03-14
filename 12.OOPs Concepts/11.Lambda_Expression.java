interface Purse
{
	void show();
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse obj = () -> System.out.print("Hello");
		obj.show();
	}
}

//lambda expression with parameters
package stringsPractice;

import java.util.Scanner;

interface My
{
	public int hello(int a,int b);
}

public class Hello 
{
	public static void main(String[] args) 
	{
		My in = (a,b)-> {return a;};
		System.out.println(in.hello(6,7));
	}
}