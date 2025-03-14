import java.util.Arrays;

public class Tk081CopyingwoDimensionalArraysUsingArrayCopy {

	public static void main(String[] args) {
		int[][] myarray = {
							{2,4,5},
							{1,7,9,3},
							{8},
							{89,5}
						  };
		int[][] dest = new int[myarray.length][];
		for(int i=0;i<myarray.length;i++)
		{
			dest[i] = new int[myarray[i].length];
			System.arraycopy(myarray, 0, dest, 1, 2);
		}
		System.out.println(Arrays.deepToString(dest));

	}

}
