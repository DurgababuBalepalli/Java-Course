import java.util.Arrays;

public class Tk077CopyingArraysUsingForLoop {

	public static void main(String[] args) {
		int[] myarray = {4,7,1,36,45,89};
		int[] otherarray = new int[myarray.length];
		
		for(int i = 0;i<myarray.length;i++)
		{
			otherarray[i] = myarray[i];
		}
		
		//converting array to String
		System.out.println(Arrays.toString(otherarray));

	}

}
