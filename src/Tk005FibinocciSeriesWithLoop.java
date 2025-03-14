
public class Tk005FibinocciSeriesWithLoop {

	public static void main(String[] args) 
	{
		int givenrange = 20;
		int number1 = 0;
		int number2 = 1;
		int temp = 0;
		System.out.println(number1);
		System.out.println(number2);
		int number3 = number1+number2;  
		System.out.println(number3);
		while(number3<givenrange)
		{
			temp = number1;    //0
			number1 = number2;   //1
			number2 = number3;  //1
			number3 = number1+number2;  //2
			System.out.println(number3);
		}

	}

}
