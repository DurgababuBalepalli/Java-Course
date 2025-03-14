import java.util.Scanner;

public class Tk070ArrayElementsUsingForLoop {

	public static void main(String[] args) {
		/*
		int[] myarray = {23,56,12,89,9};
		for(int i = 0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		}
		*/
		Scanner sc = new Scanner(System.in);
		
		int[] myarray = new int[5];
		for(int i=0;i<myarray.length;i++)
		{
			myarray[i] = i;
		}
		for(int k:myarray)
		{
			System.out.println(k);
		}
	}

}
