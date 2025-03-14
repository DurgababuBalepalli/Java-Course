package com.durga;

//multiple catch block

/* public class Hello 
{
	public static void main(String[] args)
	{
		try
		{
			int i = 5;
			int j = 0;
			int k = i/j;
			int arr[] = {2,3,4,56};
			System.out.print(arr[7]);
			
		}
		/*
		catch(ArithmeticException e)
		{
			System.out.println("error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("error");
		} /*
		//if your error is same why are you writing two catch blocks.you can write it in one block
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error");
		}
		
	}
} */

//if you want to specify error with different name.you can use multiple catch blocks
public class Hello 
{
	public static void main(String[] args)
	{
		try
		{
			int i = 5;
			int j = 2;
			int k = i/j;
			int arr[] = {2,3,4,56};
			System.out.print(arr[7]);
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Atrthematic error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("you crossed limit");
		} 
		catch(Exception e)     //for unknown exceptions you can use it.like common doctor
		{
			System.out.println("i dont know which exception it is..something wrong");
		}
		
	}
}

//Multi-catch block - means writing more exceptions in one catch block

public class Tk257MultiCatchBlock {

	public static void main(String[] args) {
		try
		{
			int k = 5/2;
			int myarray[] = {2,5,4};
			System.out.println(myarray[3]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
 