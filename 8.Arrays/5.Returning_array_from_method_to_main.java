 class Return_array
 {
 	public static int[] meth(int[] a)
 	{
 		//to get reverse array directly
 		int i,j;
 		/*for (i=a.length-1;i>=0;i--)     //length-1 useful to get reverse index of array
 		{
 			System.out.println(a[i]);
 		}*/

 		//to return array,you have to store in new array.then return
 		int[] reverse = new int[a.length];
 		for (i=0,j=reverse.length-1; i<a.length; i++,j-- )  //if you write numbers then you can use j>0.but here i specifying that i will allow only till a.length
 		{
 			reverse[j]=a[i];
 		}
 		return reverse;
 	}
 	public static void main(String[] args) {
 		int[] array = {7,9,4,7,3};
 		int[] yougot_from_return = meth(array);
 		for (int x : yougot_from_return ) 
 		{
 			System.out.println(x);
 		}
 	}
 }