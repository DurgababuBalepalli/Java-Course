
//2D arrays
public class Hello
{
	public static void main(String[] args)
	{
		
		int big[][] = {
							{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12}
					  };
		
		System.out.println(big[1][2]);
		//now iam printing all values
		for(int i=0;i<3;i++)    //to no of rows
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(big[i][j]);
			}
			System.out.println();
		}
		
	}
}

//what if array elements are not same in every row
public class Hello
{
	public static void main(String[] args)
	{
		
		int big[][] = {                                          //we call this type of arrays as jagged array
							{1,2,3,4},
							{5,6,7},                             //in jagged arrays no of cloumns are not fixed.
							{9,10,11,12}
					  };
		
		System.out.println(big[1][2]);
		//now iam printing all values
		for(int i=0;i<big.length;i++)    //to no of rows
		{
			for(int j=0;j<big[i].length;j++)
			{
				System.out.print(big[i][j]);
			}
			System.out.println();
		}
		
	}
}