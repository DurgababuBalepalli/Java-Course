import java.util.Scanner;

//for logic visit febinoocci series logic by sudhakar atchala - in c
class Feb
{
	public int meth(int number)
	{
		if(number==0)
		{
			return 0;
		}
		else if(number==1)
		{
			return 1;
		}
		else
		{
			return meth(number-1)+meth(number-2);  
		}										 
	}											  
}

public class Tk006FinocciWithRecursion {

	public static void main(String[] args) 
	{
		Feb obj = new Feb();
		int number = 6;
		for(int i=0;i<number;i++)
		{
			System.out.println(obj.meth(i));
		}
	}

}
