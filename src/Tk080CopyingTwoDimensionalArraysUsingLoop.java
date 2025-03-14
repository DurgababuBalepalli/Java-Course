import java.util.Arrays;

public class Tk080CopyingTwoDimensionalArraysUsingLoop {

	public static void main(String[] args) {
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

	}

}
