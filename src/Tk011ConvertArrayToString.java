import java.util.Arrays;
import java.util.stream.Collectors;
/*
public class Tk011ConvertArrayToString {

	public static void main(String[] args) {
		String[] myarray = {"hello","everyone","welcome","to","java"};  //stringArray
		
		for(String i : myarray)
		{
			System.out.println(i);
		}
		
		//but i don't want to print separatey. i want in this format [hello, everyone, welcome, to, java]
		//Arrays.toString() method returns the string of the input array. The returned string is a string representation of the input array.
		//The returned string contains the elements of the input array separated by the comma and followed by space. Also, the element is surrounded by ‘[]’.
		
		String s1 = Arrays.toString(myarray);
		System.out.println(s1);
		
		//using stringBuilder append method
		StringBuilder mybuilder = new StringBuilder();
		for(String j:myarray)
		{
			mybuilder.append(j);
		}
		System.out.println(mybuilder);
		
		//using Stringjoin
		String s2 = String.join("", myarray);
		System.out.println(s2);
		
		//using collectors.joining    //Java 8 provides the Stream API. You can use the joining() method of the Collectors class to convert an array to string.
		String s3 = Arrays.stream(myarray).collect(Collectors.joining());
		System.out.println(s3);
		
		
	}

}   */

//using methods - iam doing same stuff using methods
public class Tk011ConvertArrayToString
{
	public static String usingToString(String[] myStringArray)
	{
		return Arrays.toString(myStringArray);
		
	}
	
	public static void main(String[] args)
	{
		String[] myStringArray = {"hello","world","durga"};
		
		String str1 = usingToString(myStringArray);
		System.out.println(str1);
	}
}

