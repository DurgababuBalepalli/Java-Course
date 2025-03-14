
public class Tk075TwoDimensionalArrayUsingForEachLoop {

	public static void main(String[] args) {
		int[][] myarray = {
				{2,4,5},
				{1,7,9,3},
				{8}
			  };
		for(int[] inner:myarray)
		{
			for(int data:inner)
			{
				System.out.println(data);
			}
		}

	}

}
