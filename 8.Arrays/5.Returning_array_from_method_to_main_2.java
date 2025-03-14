 class Return_array
 {
 	public static int[] meth(int[] a)
 	{
 		//to return array,you have to store in new array.then return
 		int[] reverse = new int[a.length];
 		int i,j;
 		for (i=0,j=reverse.length-1; i<a.length; i++,j-- )  //if you write numbers then you can use j>0.but here i specifying that i will allow only till a.length
 		{
 			reverse[j]=a[i];
 		}
 		return reverse;
 	}
 	public static void meth1(int[] a)   //see iam using same parameter.
 	{
 		int i;
 		for (i = 0;i<a.length ;i++ ) 
 		{
 			System.out.println(a[i]);
 		}
 	}
 	public static void main(String[] args) {
 		int[] array = {7,9,4,7,3};
 		int[] yougot_from_return = meth(array);   
 		meth1(yougot_from_return);         //see iam using method in method.
 	}
 }