
public class Tk072SumAndAverageOfArrayElements {

	public static void main(String[] args) {
		int[] myarray = {2,5,3,10,30};
		
		double sum = 0;
		for(int i:myarray)
		{
			sum += i;
		}
		
		double average = sum/myarray.length;
		
		System.out.println("sum is :"+sum);
		System.out.println("Avg is :"+average);

	}

}
