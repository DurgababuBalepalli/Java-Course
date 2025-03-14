
public class Tk257MultiCatchBlock {

	public static void main(String[] args) {
		try
		{
			int k = 5/2;
			int myarray[] = {2,5,4};
			System.out.println(myarray[3]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
