
public class Tk013FindDuplicateCharInString {

	public static void main(String[] args) {
		String mystring = "aarya";
		//System.out.println(mystring.length());
		char[] myarray = mystring.toCharArray();
		
		//couting everycharacter in string
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=1;j<i;j++)  
			{
				if(myarray[i]==myarray[j])
				{
					System.out.println(myarray[j]);
				}
			}
		}
		
		
		/* to print characters
 		for(char i : myarray)
		{
			System.out.println(i);
		}*/
		
		/*anotherway to print
		for(int i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		} */
	}

}
