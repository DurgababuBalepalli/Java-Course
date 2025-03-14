class Sum_largest
{
	public static void main(String[] args) {
		int[] array = {4,2,8,9,1,4};
		int sum = 0,i;
		for (i=0;i<6 ;i++ ) 
		{
			sum = sum+array[i];
		}
		System.out.println(sum);

		//maximum number
		int max = array[0];
		for (i=0;i<6 ;i++ ) 
		{
			if (array[i]>max) 
			{
				max = array[i];
			}
		}
		System.out.println(max);
	}
}