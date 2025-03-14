package com.durga;
/*
public class Hello {

	public static void main(String[] args) 
	{
		try
		{
			int i = 2/0;   //it throws an object if this critical statement is not executed.you have to catch that exception
		}
		catch(Exception e)
		{
			//System.out.println("you got an error"); //if you want error in red color.use err insted of out
			System.err.println("you got an error");
		}
		
		System.out.println("hello");
	}

} */

//we should be specific which exception it is
//finally block executes even if you have error and if you dont have an error
public class Hello
{
	public static void main(String[] args)
	{
		try
		{
			int i = 2;
			int j = 0;
			int k = i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);  //default exception you want to throw
			System.out.println("you got arthematic error"); //user defined error throw
		}
		finally  //i will execute whether you have error or not
		{
			System.out.println("hey iam here");   //it is like medical shop.
		}
	}
}
