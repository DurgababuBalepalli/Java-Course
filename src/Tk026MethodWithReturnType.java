
class MethReturn
{
	public int meth(int[] arr)
	{
		int sum = 0;
		for(int i:arr)
		{
			sum  = sum + i;
		}
		return sum;
	}
}
public class Tk026MethodWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = {1,2,3,4,5};
		MethReturn obj = new MethReturn();
		int result = obj.meth(myarray);
		System.out.println(result);
	}

}
