
public class Tk012CheckStringContentIgnoringCases {

	public static void main(String[] args) {
		//equalsIgnoreCase() ignores capital letters and small letters while compare. 
		//for example str1 = durga,str2 = Durga.if you use equals method false gives.but equalsIgnoreCase() ignores and gives true
		
		String s1 = "my name is durga";
		String s2 = "My name is Durga";
		
		System.out.println(s1.equals(s2));  //gives false
		System.out.println(s1.equalsIgnoreCase(s2)); //gives true

	}

}
