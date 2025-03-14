//in java 1.0 there are no enums.in 1.5 introduced.
//enum is range of constants for ex:days of week(sun,mon,tue...sat),months in the year(jan,feb...dec)
/*
enum Days
{
	Sun,Mon,Tue,Wed,Thurs,Fri,Sat;
}
public class Tk092EnumExample {

	public static void main(String[] args) {
		System.out.println(Days.Sun);
		System.out.println(Days.Mon);

	}
}
*/

//we can create enum  inside the class also.in previous we have created enum outside the class.but you can't define inside method.
public class Tk092EnumExample {
	enum Days
	{
		Sun,Mon,Tue,Wed,Thurs,Fri,Sat;
	}
	
	public static void main(String[] args) {
		System.out.println(Days.Sun);
		System.out.println(Days.Mon);

	}
}