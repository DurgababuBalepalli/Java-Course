
public class Tk255MultipleCatchBlocks {

	public static void main(String[] args) {
		try
		{
			int k = 5/0;
			int myarray[] = {5,4,3,2};
			System.out.println(myarray[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("hey it is arthematic exception");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("hey it is Array index out of range exception");
		}
		catch(Exception e)
		{
			System.out.println("i can handle all exceptions");
		}

	}

}
