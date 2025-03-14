package stringsPractice;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) 
	{
		System.out.println("------------COPYING 2D ARRAYS USING LOOP-------------");
		
		int[][] myarray = {
				{34,23,56,76},
				{23,65},
				{22,89,90}
			  };
		int[][] destination = new int[myarray.length][];
		
		for(int i=0;i<myarray.length;i++)
		{
		//allocating space for each row in destination array
		destination[i] = new int[myarray[i].length];
		for(int j=0;j<myarray[i].length;j++)
		{
			destination[i][j] = myarray[i][j];
		}
		}
		
		//printing
		System.out.println(Arrays.deepToString(destination));  //deeptostring useful to print 2D array.
		
		System.out.println("------------COPYING 2D ARRAYS USING ARRAYCOPYMETHOD----------");
		
		int[][] myarr = {
							{2,4,5},
							{1,7,9,3},
							{8},
							{89,5}
			  			  };
		int[][] dest = new int[myarr.length][];
		for(int i=0;i<myarr.length;i++)
		{
		dest[i] = new int[myarr[i].length];
		System.arraycopy(myarr, 0, dest, 1, 2);
		}
		System.out.println(Arrays.deepToString(dest));
	}
		
}