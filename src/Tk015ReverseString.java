

public class Tk015ReverseString {

	public static void main(String[] args) {
		
		/*for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}*/
		
		String s1 = "durga";
		String reverseString = "";
		for(int i = s1.length()-1;i>=0;i--)
		{
			//System.out.println(i);
			reverseString = reverseString + s1.charAt(i);
		}
		
		System.out.println(reverseString);
	}

}
