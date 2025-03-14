
public class Tk082ThreeDimensionalArrayExample {

	public static void main(String[] args) {
		int[][][] myarray = {
								{
									{1,2,3},
									{45,65,23,89},
									{34}
								},
								{
									{70,92},
									{80}
								}
							};
		for(int[][] twoDarray : myarray)
		{
			for(int[] oneDarray : twoDarray)
			{
				for(int data:oneDarray)
				{
					System.out.print(data);
				}
			
			}
			
		}

	}

}
