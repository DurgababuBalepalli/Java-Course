
public class Tk074TwoDimensionalArrayUsingForLoop {

	public static void main(String[] args) {
		int[][] myarray = {
				{2,4,5},
				{1,7,9,3},
				{8}
			  };
		for(int i = 0;i<myarray.length;i++)
		{
			for(int j = 0;j<myarray[i].length;j++)
			{
				System.out.print(myarray[i][j]);
			}
			System.out.println();
		}

	}

}
