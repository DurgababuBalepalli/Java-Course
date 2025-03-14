
public class Tk022SwapStrings {

	public static void main(String[] args) {
		String s1 = "durga";
		String s2 = "babu";
		
		s1 = s1 + s2;   //add two strings send to string1. //System.out.println(s1);    //durgababu
		s2 = s1.substring(0, (s1.length()-s2.length()));  //substring is inbuilt method  //System.out.println(s2);  //durga
		s1 = s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
