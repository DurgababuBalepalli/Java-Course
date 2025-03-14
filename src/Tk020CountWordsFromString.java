import java.util.StringTokenizer;

public class Tk020CountWordsFromString {

	public static void main(String[] args) {
		
		String mystr = "hello iam durgababu. how are you";
		//using split method
		String[] wordsArray = mystr.split("\\s");
		System.out.println(wordsArray.length);  //to get how manu words.
		
		for(String i : wordsArray)
		{
			//System.out.println(i);   //to print all words
		}
		
		//using StringTokenizer() class 
		StringTokenizer stk = new StringTokenizer(mystr);
		System.out.println(stk.countTokens());  //gives how many tokens you have. i.e no of words
		
		//you can also try with manually
	}

}
