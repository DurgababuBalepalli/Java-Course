
public class Tk021ReverseWordsFromString {

	public static void main(String[] args) {
		String mystr = "Durga! donot love anyone love yourself because they may cheat you!!";
		String reverse = "";
		for(int i = mystr.length()-1;i>=0;i--)
		{
			reverse = reverse + mystr.charAt(i);
		}
		System.out.println(reverse);
		
		//to get how many words in reversed string
		String[] wordsArray = reverse.split("\\s");
		System.out.println(wordsArray.length);
		
	}

}
