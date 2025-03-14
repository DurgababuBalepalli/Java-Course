
public class Tk016CountCharacter {

	public static void main(String[] args) {
		String mystring = "durgababuaaa";
		char countinga = 'a';
		int count = 0;
		for(int i=0;i<mystring.length();i++)
		{
			if(mystring.charAt(i)==countinga)
			{
				count = count + 1;
			}
		}
		System.out.println(count);

	}

}
